package ru.geekbrains.java_core.lesson01;

public class MainClass {
    public static void main(String[] args) {
        Competitor [] competitors = {new Human("Bob"),
                new Cat("Barsik"),
                new Dog("Bobik"),
                new Deer("Bamby")};

        Team team = new Team("DreamTeam", competitors);
        Obstacle [] obstacles = {new Cross(300), new Wall(25), new Water(400)};
        Course course = new Course(obstacles);

        course.doIt(team);
        team.showResults();
        team.showWinners();
    }
}
