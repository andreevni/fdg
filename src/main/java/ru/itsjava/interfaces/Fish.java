package ru.itsjava.interfaces;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Fish can swim!)");
    }

    @Override
    public double maxSwimSpeed() {
        return 120;
    }
}
