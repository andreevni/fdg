package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class ComparablePrac {
    public static void main(String[] args) throws CloneNotSupportedException {
        Boy vitalik = new Boy("Vitalik", 15, 170);
        Boy vasiliy = new Boy("Vasya", 14, 160);
        Boy vanya = new Boy("Vanya", 18, 180);
        Person vitya = new Person("Vitya", "Avdeev", 31);
        Person alex = new Person("Alex", "Alexeev", 32);
        Person fedor = new Person("Alex", "Alexeev", 29);

//        System.out.println("vitalik.compareTo(vasiliy) = " + vitalik.compareTo(vasiliy));
//        System.out.println("vasiliy.compareTo(vanya) = " + vasiliy.compareTo(vanya));
//
//        Boy[] boys ={vanya,vasiliy,vitalik};
//        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
//
//        Arrays.sort(boys);
//        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        System.out.println("alex.compareTo(fedor) = " + alex.compareTo(fedor));
        System.out.println("fedor.compareTo(vitya) = " + fedor.compareTo(vitya));
        System.out.println("vitya.compareTo(fedor) = " + vitya.compareTo(fedor));
        Person[] persons = {vitya, alex, fedor};
        Arrays.sort(persons);
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));

        Person fedor2 = (Person) fedor.clone();
        Person alex2 = (Person) alex.clone();
        System.out.println("fedor2 = " + fedor2);
        System.out.println("fedor = " + fedor);
        System.out.println("alex2 = " + alex2);
        System.out.println("alex = " + alex);
    }
}
