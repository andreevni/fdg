package ru.itsjava.interfaces;

public class InterfacesPrac {
    public static void main(String[] args) {
        Creatable khotabich = new Gin();
        Creatable badGin = new BadGin();
        Man man1 = new Man();
        Dog dog1 = new Dog();
        Runnable cat1 = new Cat();
        Flyable bird1 = new Bird();
        Swimable fish1 = new Fish();
//        man1.walk();
//        man1.run();
//        System.out.print("Man can run a distance of " + man1.maxRunDistance());
//        System.out.println(" km!");
//        man1.swim();
//        System.out.print("And man can swim with max speed - " + man1.maxSwimSpeed());
//        System.out.println(" km/h!");
//        System.out.println();
//        dog1.run();
//        System.out.print("Dog can run a distance of " + dog1.maxRunDistance());
//        System.out.println(" km!");
//        dog1.swim();
//        System.out.print("Dog can swim with max speed " + dog1.maxSwimSpeed());
//        System.out.println(" km/h!");
//        dog1.walk();
//        System.out.println();
//        cat1.run();
//        System.out.print("Cat can run a distance of about " + cat1.maxRunDistance());
//        System.out.println(" km!");
//        System.out.println();
//        bird1.fly();
//        System.out.println("The bird can fly a distance of about " + bird1.flyMaxDistance());
//        System.out.println();
//        fish1.swim();
//        System.out.print("Fish can swim with max speed " + fish1.maxSwimSpeed());
//        System.out.println(" km/h!");

        badGin.canYouCreateWish();


    }
}
