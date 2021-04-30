package ru.itsjava.interfaces;

public class Man implements Walkable, Swimable, Runnable, Talkable {
    @Override
    public void walk() {
        System.out.println("Man can walk!)");
    }

    @Override
    public void run() {
        System.out.println("Man can run!)");
    }

    @Override
    public int maxRunDistance() {
        return 30;

    }

    @Override
    public void swim() {
        System.out.println("Man can swim!)");
    }

    @Override
    public double maxSwimSpeed() {
        return 20;
    }

    @Override
    public void talk() {
        System.out.println("Man can talk, sometimes a lot!)");
    }
}
