package ru.itsjava.dogsPractiseAgain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Shepherd extends Dog {
    public Shepherd(String nickName, String gender, double weight) {
        super(nickName, gender, weight);
    }
}
