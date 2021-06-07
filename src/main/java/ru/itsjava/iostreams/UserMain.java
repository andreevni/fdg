package ru.itsjava.iostreams;


import java.io.*;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("Serialization Practice", "111_Hello_Serialization!");
        User user2 = new User("User2Serialization", "222_Hello!");

        try(ObjectOutputStream outputStream1 = new ObjectOutputStream(new FileOutputStream("src/main/resources/users.out"))) {
            outputStream1.writeObject(user1);
            outputStream1.writeObject(user2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/users.out"))) {
            Object obj1 = inputStream.readObject();
            Object obj2 = inputStream.readObject();
            User userObj1 = (User) obj1;
            User userObj2 = (User) obj2;
            System.out.println(userObj1 + " " + userObj2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    }










