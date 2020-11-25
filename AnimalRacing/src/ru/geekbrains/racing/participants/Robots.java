package ru.geekbrains.racing.participants;

public class Robots implements Robots_,Swimable  {

    String type;
    String name;
    Color color;

    int maxRunDistance;
    int maxJumpHeight;
    boolean onDistance;
    int maxSwimDistance;
    public boolean isOnDistance() {
        return onDistance;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }
    public Robots(String type, String name, Color color) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.maxRunDistance = 200;
        this.maxJumpHeight = 200;
        this.onDistance = true;
        maxSwimDistance = TYPICAL_SWIM_DISTANCE * 10;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Run OK");
        } else {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Run FAILED");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Jump OK");
        } else {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Jump FAILED");
            onDistance = false;
        }
    }

    @Override
    public void info() {
        System.out.println(color.getEnglishColorName() + " " + type + " " + name + ": " + onDistance);
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Swim OK");
        } else {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Swim FAILED");
            onDistance = false;
        }
    }
}
