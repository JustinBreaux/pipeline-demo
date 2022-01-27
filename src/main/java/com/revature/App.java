package com.revature;

import io.javalin.Javalin;

public class App {
    private static Javalin app;

    public static void main(String[] args) {
        app = Javalin.create(); //This represents te config of framework at runtime

        app.get("/hello", ((ctx) -> {
            String url = ctx.url();
            System.out.println(url);
            ctx.html("<h1> Hello Javalin </h1>");
            ctx.status(200);
        })); //ctx represents context of request/response for the Handler

        app.start();
    }
}
