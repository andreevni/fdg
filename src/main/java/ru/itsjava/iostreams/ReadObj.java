package ru.itsjava.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObj {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/people.bin"))){
        int personCount = objectInputStream.readInt();
        Person[] people = new Person[personCount];
            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) objectInputStream.readObject();
            }

            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
