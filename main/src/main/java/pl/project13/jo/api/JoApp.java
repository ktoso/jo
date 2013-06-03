package pl.project13.jo.api;

import pl.project13.jo.scala.JoAppBuilder;

public class JoApp {

    public static Runnable fromString(String app) {
        return new JoAppBuilder().runnableFrom(app);
    }
}
