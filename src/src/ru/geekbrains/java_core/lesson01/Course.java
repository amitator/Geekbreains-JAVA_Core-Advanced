package ru.geekbrains.java_core.lesson01;

public class Course {
    protected Obstacle [] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Competitor [] competitors){
        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    System.out.println(c.getName() + " OUT");
                    break;
                }
            }
        }
    }
}
