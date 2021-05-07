package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private final boolean isMale;
    private final int age;
}
