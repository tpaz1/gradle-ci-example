package com.example;
import com.google.common.base.Joiner;

public class App {
    public static String greet(String name) {
        return Joiner.on(" ").join("Hello,", name);
    }
}
