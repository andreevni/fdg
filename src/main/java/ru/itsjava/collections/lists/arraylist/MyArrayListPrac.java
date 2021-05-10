package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPrac {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("Привет");
        list.add("Пока");
        System.out.println("list.size() = " + list.size());
        list.add("Пока!");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("list.size() = " + list.size());
        System.out.println(list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Пока1\") = " + list.contains("Пока!"));
        list.clear();
        System.out.println("list = " + list);
    }
}
