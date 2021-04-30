package ru.itsjava.Object;

import java.util.Objects;

public class Giraffe extends Animals {
    private final String giraffeColor;


    public Giraffe(String giraffeColor) {
        this.giraffeColor = giraffeColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Giraffe)) return false;
        Giraffe giraffe = (Giraffe) o;
        return giraffeColor.equals(giraffe.giraffeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(giraffeColor);
    }

    @Override
    public String toString() {
        return "Giraffe{ " + giraffeColor + " }";
    }

}
