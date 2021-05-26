package ru.itsjava.collections.lists.linkedlist;


public class MyLinkedListPrac {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("String12");
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
        list.add("Str5");
        list.add("Str6");
        list.add("String2");

        System.out.println(list);


        System.out.println("list.lastIndexOf(\"String12\") = " + list.lastIndexOf("String12"));
        System.out.println("list.indexOf(\"String2\") = " + list.indexOf("String2"));

        list.add(8, "STR0");
        System.out.println("list = " + list);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("s1");
        myLinkedList.add("s2");
        myLinkedList.add("s3");
        myLinkedList.add("s4");
        myLinkedList.add(4,"s0");
        System.out.println("myLinkedList = " + myLinkedList);


    }
}
