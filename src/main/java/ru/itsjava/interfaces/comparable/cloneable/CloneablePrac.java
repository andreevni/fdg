package ru.itsjava.interfaces.comparable.cloneable;

public class CloneablePrac {
    public static void main(String[] args) throws CloneNotSupportedException {
    Girl dasha = new Girl("Dasha" , 160);

    Girl dasha2 = (Girl) dasha.clone();

        System.out.println("dasha = " + dasha);
        System.out.println("dasha2 = " + dasha2);
    }
}
