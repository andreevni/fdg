package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String surName;
    private final int age;

    @Override
    public int compareTo(Person person) {
        int result;
        result = surName.compareTo(person.surName);
        if (result != 0) return result;
        result = name.compareTo(person.name);
        if (result != 0) return result;
        result = Integer.compare(age, person.age);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
