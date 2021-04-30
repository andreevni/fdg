package ru.itsjava.interfaces;

public class Plant implements Eatable {

    @Override
    public void eat() {
        System.out.println("Plants eat water, but some wild plants can eat insects!");
    }
}
