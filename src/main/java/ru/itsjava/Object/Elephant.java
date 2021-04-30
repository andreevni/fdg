package ru.itsjava.Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Objects;

@Data
@AllArgsConstructor

public class Elephant extends Animals {
    private String elephantName;
    private final int howOldIsElephant;


//    public Elephant(String elephantName, int howOldIsElephant) {
//        this.elephantName = elephantName;
//        this.howOldIsElephant = howOldIsElephant;
//    }

//  Изменил метод для equals и hashcode, чтобы все работало правильно
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Elephant)) return false;
//        Elephant elephant = (Elephant) o;
//        return howOldIsElephant == elephant.howOldIsElephant && elephantName.equals(elephant.elephantName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(elephantName, howOldIsElephant);
//    }
}
