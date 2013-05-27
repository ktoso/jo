import sbt._
import sbt.Keys._
import sbtassembly.Plugin._
import AssemblyKeys._
import sbtantlr.SbtAntlrPlugin._

object BuildSettings {
  val buildOrganization = "project13"
  val buildVersion      = "1.0.0"
  val buildScalaVersion = "2.10.0"

  val myAssemblySettings = assemblySettings ++
    Seq(
      test in assembly := {},
      mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) => {
          case PathList("org", "apache", rest) => MergeStrategy.last
          case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.last
          case x => MergeStrategy.last
        }
      }
    )

  val buildSettings = Defaults.defaultSettings ++ Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion,
    resolvers   ++= Resolvers.myResolvers,
    parallelExecution in Test := false
  ) ++ myAssemblySettings

}

object Resolvers {

  val myResolvers = Seq(
    "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases",
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
    "EasyTesting Releases" at "http://repo1.maven.org/maven2/org/easytesting",
    "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
  )
}

object Versions {
  val guava = "14.0"
  val rainbow = "0.2"
        
  val mockito = "1.8.5"
  val scalatest = "2.0.M5-B1"
        
  val fest = "1.4"
}

object Dependencies {
  import Resolvers._
  import Versions._

  // ASM
  val asm                   = "org.ow2.asm"          % "asm"                      % "4.1"

  val antlr4                =  "org.antlr" % "antlr4-runtime" % "4.0"

  // Logging
  val logback               = "ch.qos.logback"        % "logback-classic"         % "1.0.0"
  val log4jOverSlf4j        = "org.slf4j"             % "log4j-over-slf4j"        % "1.6.1"
  val jclOverSlf4j          = "org.slf4j"             % "jcl-over-slf4j"          % "1.6.1"
  val julToSlf4jBridge      = "org.slf4j"             % "jul-to-slf4j"            % "1.6.1"

  val logging               = Seq(logback, log4jOverSlf4j, jclOverSlf4j)

  // general tools
  val scalaToolsTime        = "org.scala-tools.time"  %%  "time"                  % "0.5" intransitive()
  val jodaTime              = "joda-time"             %   "joda-time"             % "2.1"
  val jodaTimeConvert       = "org.joda"              %   "joda-convert"          % "1.2"
  val scalaz                = "org.scalaz"            %% "scalaz-core"            % "6.0.4"
  val guava                 = "com.google.guava"    % "guava"                   % Versions.guava
  val findbugs              = "com.google.code.findbugs" % "jsr305" % "1.3.+"

  // testing
  val scalaTest               = "org.scalatest"       % "scalatest_2.10.0-RC3"    % Versions.scalatest
  val mockito                 = "org.mockito"         % "mockito-core"            % Versions.mockito

  val testing                 = Seq(scalaTest, mockito).map(_ % "test")

  val jsoup                   = "org.jsoup"         % "jsoup"               % "1.7.2"

  // akka2
  val akka2Version           = "2.0.5"
  val akka2Actor             = "com.typesafe.akka" % "akka-actor"          % akka2Version
  val akka2Slf4j             = "com.typesafe.akka" % "akka-slf4j"          % akka2Version
  val akka2TestKit           = "com.typesafe.akka" % "akka-testkit"        % akka2Version % "test"
  val akka2Full              = Seq(akka2Actor, akka2Slf4j, akka2TestKit)

  // terminal coloring
  val rainbow                 = "pl.project13.scala"      %% "rainbow"                   % Versions.rainbow

  // java stuff
  val festAssert              = "org.easytesting"          % "fest-assert"               % Versions.fest      % "test"

}

object OculusBuild extends Build {
  import BuildSettings._
  import Dependencies._

  lazy val root = Project(
    "root",
    file("."),
    settings = buildSettings
  ) aggregate(common, main)


  lazy val common = Project(
    "common",
    file("common"),
    settings = buildSettings ++
      Seq(
        libraryDependencies ++=
          Seq(logback, scalaz, guava, findbugs, rainbow) ++
          Seq(antlr4, asm) ++
            logging ++
            testing
      )
  ) 

  lazy val main = Project(
    "main",
    file("main"),
    settings = buildSettings ++ antlrSettings ++ Seq(
      libraryDependencies ++= Seq(jsoup) ++ testing,
      mainClass := Some("pl.project13.scala.go2j.ParseRunner")
    )
  ) dependsOn(common)
}
