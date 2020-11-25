package ru.geekbrains.racing;

import ru.geekbrains.racing.obstacles.Cross;
import ru.geekbrains.racing.obstacles.Obstacle;
import ru.geekbrains.racing.obstacles.Wall;
import ru.geekbrains.racing.obstacles.Water;
import ru.geekbrains.racing.participants.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Barsik", Color.RED), new Dog("Bobik", Color.BLACK), new Duck("Scrooge", Color.WHITE)};
        Obstacle[] obstacles = {new Cross(100), new Wall(10), new Water(15)};

        Robots[] robots=new Robots[2];
         robots[0]=new Robots("T08","Egz", Color.RED);
        robots[1]=new Robots("T08007","Egz2", Color.BLACK);
        for (Animal a : animals) {
            for (Obstacle o : obstacles) {
                o.doIt(a,null);
                if (!a.isOnDistance()) {
                    break;
                }
            }
        }
        for (Robots r : robots) {
            for (Obstacle o : obstacles) {
                o.doIt(null,r);
                if (!r.isOnDistance()) {
                    break;
                }
            }
        }





        System.out.println("RESULTS:");
        for (Animal p : animals) {
            p.info();
        }
        for (Robots r : robots) {
            r.info();
        }


    }
}
