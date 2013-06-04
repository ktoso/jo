package pl.project13.jo.api;

import pl.project13.jo.scala.GoFileParser;

public class JoApp {

    public static JoPackage fromString(String app) {
        return new GoFileParser().parse(app);
    }
}
