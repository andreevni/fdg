package ru.itsjava.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FruitMain {
    public static void main(String[] args) {
//        1. Создать множество фруктов
        Fruit banana = new Fruit("Banana", 0.210);
        Fruit pineApple = new Fruit("Pineapple", 0.890);
        Fruit apricot = new Fruit("Apricot", 0.120);
        Fruit kiwi = new Fruit("Kiwi", 0.100);
        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(banana, pineApple, apricot, kiwi));
        System.out.println("fruitSet = " + fruitSet);
//        2. Добавить фрукт. Добавить тот же фрукт
        Fruit orange = new Fruit("Orange", 0.320);
        System.out.println("fruitSet.add(orange) = " + fruitSet.add(orange));
        System.out.println("fruitSet.add(banana) = " + fruitSet.add(banana));
//        3. Удалить фрукт из множества
        System.out.println("fruitSet.remove(banana) = " + fruitSet.remove(banana));
//        4. Проверить содержится ли фрукт в множестве фруктов
        System.out.println("fruitSet.contains(banana) = " + fruitSet.contains(banana));
        System.out.println("fruitSet = " + fruitSet);

    }
}
