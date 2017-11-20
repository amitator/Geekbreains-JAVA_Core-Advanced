package ru.geekbrains.java_core.lesson01;

public class Team {
    protected String name;
    protected Competitor [] competitors;

    public Team(String name, Competitor[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    protected void showResults(){
        System.out.println("Results:");
        for (Competitor c : competitors) {
            if (c.isOnDistance()) {
                System.out.println(c.getName() + " WIN");
            } else {
                System.out.println(c.getName() + " LOSE");
            }
        }
    }
}
