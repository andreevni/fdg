package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPrac {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("Привет");
        list.add("Пока1");
        System.out.println("list.size() = " + list.size());
        list.add("Пока2");
        list.add("Пока3");
        list.add("Пока4");
        list.add("Пока5");
        list.add("Пока6");
        list.add("Пока7");
        list.add("Пока8");
        list.add("Пока9");
        list.add("Пока10");
//        System.out.println("list.size() = " + list.size());
//        System.out.println(list);
//        System.out.println("list.isEmpty() = " + list.isEmpty());
//        System.out.println("list.contains(\"Пока1\") = " + list.contains("Пока1"));
////        list.clear();
////        System.out.println("list = " + list);
//        System.out.println("list.remove(\"Пока!\") = " + list.remove("Пока1"));
//        System.out.println("list = " + list);
//        System.out.println("list.size() = " + list.size());
//        list.add("До свидания!)");
//        System.out.println("list = " + list);
//        list.remove(10);
//        System.out.println("list = " + list);
//        list.remove(1);
//        System.out.println("list = " + list);
        MyArrayList list1 = new MyArrayList();
        list1.add("Element1");
        list1.add("Element2");
        list1.add("Element3");
        list1.add("Element4");
        System.out.println("list = " + list1);
        System.out.println("list.get(0) = " + list1.get(3));
        System.out.println("list1.set(0,\"Elem11\") = " + list1.set(0, "Elem11"));
        System.out.println(list1);




    }
}
