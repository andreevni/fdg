package ru.itsjava.interfaces;

public class Dog implements Walkable, Swimable, Runnable {
    @Override
    public void run() {
        System.out.println("Dog can run!");
    }

    @Override
    public int maxRunDistance() {
        return 1000;
    }

    @Override
    public void swim() {
        System.out.println("And Dog can swim! ");
    }

    @Override
    public double maxSwimSpeed() {
        return 50;
    }

    @Override
    public void walk() {
        System.out.println("And The Dog needs to walk sometimes)!  ");
    }
}
