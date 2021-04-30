package ru.itsjava.interfaces;

public class Cow implements Talkable , Eatable{
    @Override
    public void talk() {
        System.out.println("Cow can say muuuu!!!");
    }

    @Override
    public void eat() {
        System.out.println("Cow can eat grass)");
    }
}
