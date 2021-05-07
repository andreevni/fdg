package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPrac2 {
    public static void main(String[] args) {
        Watch vitalySeiko = new Watch("Seiko", "Vitaly", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitalySeiko, viktorSeiko, valentinOmega, dmitriySeiko));

        System.out.println("Our watches : " + watches);
//        Вывести все часы у которых фирма сейко
        for (Watch watch : watches) {
            if (watch.getFirm().equals("Seiko")) {
                System.out.print(" Seiko watches : " + watch + " ");
            }
        }
        System.out.println();
        for (Watch watch : watches){
            if (watch.getPrice() > 25_000.0){
                System.out.print("Watches with price more than 25_000.0 : " + watch + " ");
                break;
            }
        }
        System.out.println();

//        Пропустить первые два элемента
        int seikoCount = 0;
        for (int i =0 ;i < watches.size() ; i++) {
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2){
                seikoCount++;
            } else {
                System.out.print(watches.get(i) + " ");
            }

        }
        System.out.println();




    }
}

