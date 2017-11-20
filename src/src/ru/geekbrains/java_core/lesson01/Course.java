package ru.geekbrains.java_core.lesson01;

public class Course {
    protected Obstacle [] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Competitor c : team.getCompetitors()) {
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
