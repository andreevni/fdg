package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    private final String carBrand;
    private final String carColor;
    public final static double CAR_COST = 500_000.0;

    public static void main(String[] args) {
        Car bentli = new Bentli("Bentli", "purple-black");
        Car zhiguli = new Zhiguli("Zhiguli", "red");
        System.out.println("Zhiguli.CAR_COST = " + Zhiguli.CAR_COST);
        System.out.println("Bentli.CAR_COST = " + Bentli.CAR_COST);
    }
}
