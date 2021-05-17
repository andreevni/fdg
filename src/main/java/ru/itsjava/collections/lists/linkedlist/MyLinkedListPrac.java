package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPrac {
    public static void main(String[] args) {
        MyLinkedLIst list = new MyLinkedLIst();
        list.add("String1");
        System.out.println("list = " + list);
        list.add("String2");
        System.out.println(list);
        list.add("String3");
        list.add("String4");

//        System.out.println(list);
//        System.out.println("list.size() = " + list.size());
//
//        System.out.println(list);
//        System.out.println("list.size() = " + list.size());


//        System.out.println("get : " + list.get(3));
//        System.out.println("list : "+list);
//        System.out.println("list.contains(\"String2\") = " + list.contains("String2"));
//        System.out.println("list.indexOf(\"S\") = " + list.indexOf("String4"));
        list.add("String2");

        System.out.println(list);
        System.out.println("list.lastIndexOf(\"String1\") = " + list.lastIndexOf("String2"));


    }
}
