package ru.itsjava.dogsPractiseAgain;

public class DogMain {
    public static void main(String[] args) {
        Dog dogHusky1 = new Husky("Husky1", "gentleman", 10);
        Dog dogHusky2 = new Husky("Husky2", "gentleman", 11.2);
        Dog dogShep1 = new Shepherd("Shepherd1", "female", 9);
        Dog dogShep2 = new Shepherd("Shepherd2", "female", 8.4);
        Dog[] dogs = new Dog[]{dogHusky1, dogHusky2, dogShep1, dogShep2};
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getNickName() + " - ");
            System.out.println(dogs[i].getGender());
        }
    }
}
