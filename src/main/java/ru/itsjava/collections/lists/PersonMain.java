package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        Person vasiliy = new Person("Vasiliy", false, 18);
        Person harry = new Person("Harry", false, 21);
        Person henri = new Person("Henri", false, 25);
        Person eerki = new Person("Eerki", false, 24);
        Person ilya = new Person("Ilya", false, 31);
        Person olga = new Person("Olga", true, 24);
        Person svetlana = new Person("Svetlana", true, 33);
        Person nastya = new Person("Nastya", true, 25);
        Person anna = new Person("Anna", true, 29);

        List<Person> listPerson = new ArrayList<>(Arrays.asList(vasiliy, harry, henri, eerki, ilya, olga, svetlana, nastya, anna));
// Возвращаем всех военнообязанных мужчин, которым меньше 27 и больше 18 и имя которых начинается на Н
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i).isMale() == false && listPerson.get(i).getAge() < 27 && listPerson.get(i).getAge() > 18 && listPerson.get(i).getName().contains("H")) {
                System.out.println(listPerson.get(i));
            }
        }
        System.out.println();
//        средний возраст женщин
        int age = olga.getAge() + svetlana.getAge() + nastya.getAge() + anna.getAge();
        System.out.println("Средний возраст всех женщин : " + age / 4 + " лет");

    }
}
