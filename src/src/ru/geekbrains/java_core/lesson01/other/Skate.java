package ru.geekbrains.java_core.lesson01.other;

public class Skate implements Transport {
    public void start(AnotherHuman ah) {
        System.out.println("Human skate start");
    }

    public void end(AnotherHuman ah) {
        System.out.println("Human skate stop");
    }
}
