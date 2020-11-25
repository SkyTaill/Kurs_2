package ru.geekbrains.racing.obstacles;

import ru.geekbrains.racing.participants.Animal;
import ru.geekbrains.racing.participants.Robots;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Animal a, Robots r) {
        if(a==null){
            r.run(height);
        }else {
            a.run(height);
        }
    }


}
