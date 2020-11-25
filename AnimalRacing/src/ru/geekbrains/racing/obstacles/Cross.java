package ru.geekbrains.racing.obstacles;

import ru.geekbrains.racing.participants.Animal;
import ru.geekbrains.racing.participants.Robots;

public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }





    @Override
    public void doIt(Animal a, Robots r) {
        if(a==null){
            r.run(length);
        }else {
            a.run(length);
        }

    }


}
