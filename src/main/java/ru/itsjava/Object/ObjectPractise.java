package ru.itsjava.Object;

public class ObjectPractise {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1==obj2);

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        obj2 = obj1;

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog jourka = new Dog("Jourka",4);
        Dog jourka2 = new Dog("Jourka",4);
        Dog gurka = new Dog("Gurka", 4);
        Dog gurka11 = new Dog("sdfs",6);

        System.out.println("jourka.equals(jourka2) = " + jourka.equals(jourka2));
        System.out.println("gurka.equals(gurka) = " + jourka.equals(gurka));

        System.out.println("gurka.toString() = " + gurka.toString());
        System.out.println(gurka);
        System.out.println("gurka.getNickName() = " + gurka.getNickName());
        gurka.setPawsCount(3);
        System.out.println("gurka.getPawsCount() = " + gurka.getPawsCount());
        System.out.println("gurka11.getNickName() = " + gurka11.getNickName());


    }
}
