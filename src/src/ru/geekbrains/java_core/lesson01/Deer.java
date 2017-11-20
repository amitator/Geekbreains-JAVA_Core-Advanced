package ru.geekbrains.java_core.lesson01;

public class Deer extends Animal implements Competitor{
    public Deer(String name) {
        super("Deer", name, 4000, 50, 500);
    }
}
