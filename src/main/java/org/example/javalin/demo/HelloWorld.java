package org.example.javalin.demo;

import io.javalin.Javalin;

public class HelloWorld {

	public static void main(String[] args) {
        Javalin demo_javalin_app = Javalin.create().start(7000);
        demo_javalin_app.get("/", ctx -> ctx.result("Hello World"));
    }

}
