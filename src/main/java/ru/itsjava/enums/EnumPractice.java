package ru.itsjava.enums;

public class EnumPractice {
    public static void main(String[] args) {

        System.out.println("Season.WINTER = " + Season.WINTER);

        System.out.println("Season.valueOf(\"winter\") = " + Season.valueOf("WINTER"));

        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.print(season + " ");
        }
        System.out.println("");

        Season season1 = Season.SUMMER;
        switch (season1) {
            case FALL -> {
                System.out.println("Its Fall");
                break;
            }
            case SPRING -> {
                System.out.println("Its Spring");
                break;
            }
            case SUMMER -> {
                System.out.println("Its Summer!!!)");
                break;
            }
            case WINTER -> {
                System.out.println("Its Winter");
                break;
            }
        }

        System.out.println("Coffee.AMERICANO = " + Coffee.AMERICANO);

        System.out.println(DaysOfTheWeek.MONDAY.toString());
    }
}
