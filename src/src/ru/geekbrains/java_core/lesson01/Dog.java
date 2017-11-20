package ru.geekbrains.java_core.lesson01;

public class Dog extends Animal implements Competitor {
    public Dog(String name) {
        super("Dog", name, 1000, 10, 10);
    }
}
