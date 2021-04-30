package ru.itsjava.interfaces;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird needs to fly!");
    }

    @Override
    public String flyMaxDistance() {
        return "10_000.0 km!";
    }
}
