package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPrac {
    public static void main(String[] args) {
     MyLinkedLIst list = new MyLinkedLIst();
     list.add("String1");
        System.out.println("list = " + list);
        list.add("String2");
        System.out.println(list);
        list.add("String3");
        System.out.println(list);
        System.out.println("list.size() = " + list.size());
    }
}
