package ru.itsjava.git;

import ru.itsjava.exceptions.Person;

public class MainPerson {
    public static void main(String[] args) {
        ru.itsjava.exceptions.Person person1 = new Person("Vova", 151);
        person1.ageCheck();
    }
}
