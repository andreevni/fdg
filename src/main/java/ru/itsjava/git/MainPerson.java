package ru.itsjava.git;

import ru.itsjava.exceptions.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person vova = new Person("Vova", 151);
        vova.ageCheck();
    }
}
