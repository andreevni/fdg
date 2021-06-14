package ru.itsjava.enums;

public enum Coffee {
    ESPRESSO("strong") , AMERICANO("with water") , CAPPUCCINO("with milk"), LATTE("with a little more milk than cappuccino");

   private final String characteristic;
    Coffee(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String toString() {
        return "Coffee{ " + this.name() +
                " characteristic= \" " + characteristic + " \" " +
                " }";
    }
}
