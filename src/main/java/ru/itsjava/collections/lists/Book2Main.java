package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book2Main {
    public static void main(String[] args) {
        Book javaEckel = new Book("Java", "Bruce Eckel", 1200);
        Book javaShildt = new Book("Java", "Herbert Schildt", 1500);
        Book headFirst = new Book("Head First Изучаем Джава", "Кэти Сьерра", 500);
        Book javaEffective = new Book("Java эффективное программмирование", "Джошуа Блох", 1300);
        Book javaFoundations = new Book("Основы Java ", "Гари Корнелл", 1300);
        Book javaSpring = new Book("Основы Spring", "Крейг Уоллс", 1300);
        Book javaForEveryone = new Book("Java для всех!", "Алексей Васильев", 1300);
        Book methodsInJava = new Book("Методы в Java", "Валерий Романчик", 1300);

        List<Book> bookListJava = new ArrayList<>(Arrays.asList(javaEckel, javaShildt, headFirst, javaEffective, javaFoundations, javaSpring, javaForEveryone, methodsInJava));
        System.out.println("Индекс делится на 3 : ");
        for (int i = 0; i < bookListJava.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(bookListJava.get(i));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Равны \"java\" : ");
        for (Book book : bookListJava) {
            if (book.getTitle().equalsIgnoreCase("Java")) {
                System.out.println(book);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Пропускаем первые 3 книги в списке: ");
        for (int i = 0; i < bookListJava.size(); i++) {
            if (i > 2) {
                System.out.println(bookListJava.get(i));
            }
        }
        System.out.println();
        System.out.println("Пропускаем первые две книги java : ");
        int count = 0;
        for (int i = 0; i < bookListJava.size(); i++) {
            if (bookListJava.get(i).getTitle().equalsIgnoreCase("java") && count < 2) {
                count++;
            } else {
                System.out.println(bookListJava.get(i));
            }
        }
        System.out.println();
        System.out.println("Длина автора делиться на 3,  первая книга : ");
        for (int i = 0; i < bookListJava.size(); i++) {
            if (bookListJava.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(bookListJava.get(i));
                break;

            }
        }
        System.out.println("Длина автора делиться на 3 , все книги : ");
        for (int i = 0; i < bookListJava.size(); i++) {
            if (bookListJava.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(bookListJava.get(i));

            }
        }
    }
}

