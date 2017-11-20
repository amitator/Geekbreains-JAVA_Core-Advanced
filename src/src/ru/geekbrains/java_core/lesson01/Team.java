package ru.geekbrains.java_core.lesson01;

public class Team {
    protected String name;
    protected Competitor [] competitors;

    public Team(String name, Competitor[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    protected void showResults(){
        System.out.println("Results for the whole team " + name + ":");
        for (Competitor c : competitors) {
            if (c.isOnDistance()) {
                System.out.println(c.getName() + " WIN");
            } else {
                System.out.println(c.getName() + " LOSE");
            }
        }
    }

    protected void showWinners() {
        System.out.println("The winners are:");
        for (Competitor c : competitors) {
            if (c.isOnDistance()) {
                System.out.println(c.getName());
            }
        }
    }

    protected Competitor[] getCompetitors() {
        return competitors;
    }

}
