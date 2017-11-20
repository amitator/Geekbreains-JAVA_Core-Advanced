package ru.geekbrains.java_core.lesson01;

public interface Competitor {
    String getName();
    void run(int distance);
    void jump(int height);
    void swim(int distance);
    boolean isOnDistance();
}
