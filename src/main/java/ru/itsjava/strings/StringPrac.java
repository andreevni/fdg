package ru.itsjava.strings;

import java.util.Locale;

public class StringPrac {
    public static void main(String[] args) {
//  Так как строка являеться immutable нам приходиться строке именно присваивать метод)) тогда UpperCase работает!) А так же это значит,
//  что создаёться новая строка.
        String str1 = "Я строка";
        String str2 = new String("Я строка");
        str1.toUpperCase(Locale.ROOT);
        str1 = str1.toUpperCase(Locale.ROOT);
        System.out.println(str1);
//        Попробовал заинтернить
        System.out.println(str1 == str2);
        str2 = str1.intern();
        System.out.println(str1 == str2);
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));


// Попробовал применить билдер)
        StringBuilder strB1 = new StringBuilder(str1);
        strB1.append(" my");
        strB1.append(" friend");
        System.out.println(strB1);
        
// перевернул строку
        System.out.println("strB1.reverse() = " + strB1.reverse());

//  попробовал разбить содержание str1 на массив строк
        String[] strs = str1.split(" ");
        System.out.println("strs[1] = " + strs[1]);
        System.out.println("strs[0] = " + strs[0] + "!");


    }
}

