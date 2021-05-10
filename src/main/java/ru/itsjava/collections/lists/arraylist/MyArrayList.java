package ru.itsjava.collections.lists.arraylist;

import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;


    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return realSize == 0;

    }

    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
//            копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
//            вставка нашего элемента
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        array = new Object[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array, 0, array, 0, array.length - 1);
        }
        return false;
    }

    public void clear() {
        array = new Object[array.length];

    }


    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public String toString() {
//        return "MyArrayList{ "+Arrays.toString(array) + " }";
        StringBuilder stringBuilder = new StringBuilder("MyArrayLst{ ");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
