package ru.geekbrains.java_core.lesson01;

public class Cat extends Animal implements Competitor{
    public Cat(String name) {
        super("Cat", name, 500, 50, 0);
    }
}
