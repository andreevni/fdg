package ru.itsjava.dogsPractiseAgain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog {
    private String nickName;
    private String gender;
    private double weight;

    public Dog() {

    }

}
