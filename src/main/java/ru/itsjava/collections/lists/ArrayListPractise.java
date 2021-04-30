package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise {
    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<>();

        Watch seiko = new Watch("Seiko", "Vitaly", 18000.0);
        Watch gShock = new Watch("GSHOCK", "Best Dancer", 10000.0);

        watchesList.add(seiko);
        watchesList.add(gShock);

        for (Watch elemWatch : watchesList ){
            System.out.println(elemWatch);
        }

//        watchesList.remove(0);
        watchesList.remove(seiko);
        System.out.print("List: ");

        for (Watch elemWatch : watchesList ){
            System.out.print(elemWatch + " ");
        }
        System.out.println();

        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));
        System.out.println("watchesList = " + watchesList);

        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());

        watchesList.set(0, seiko);
        System.out.println(watchesList);

    }

}
