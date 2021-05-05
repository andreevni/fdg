package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
    private final String name;
    private int age;


    public void ageCheck() throws AgeNotValidException {
        int age = this.age;
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("Not valid age!!!");
        } else {
            System.out.println("Возраст : " + age);
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Vova", 151);
        person1.ageCheck();
    }
}

