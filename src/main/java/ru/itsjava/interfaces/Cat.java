package ru.itsjava.interfaces;

public class Cat implements Runnable {
    @Override
    public void run() {
        System.out.println("Cat is always runs fast!");
    }

    @Override
    public int maxRunDistance() {
        return 1000;
    }
}
