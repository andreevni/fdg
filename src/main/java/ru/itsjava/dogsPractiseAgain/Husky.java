package ru.itsjava.dogsPractiseAgain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Husky extends Dog {
    public Husky(String nickName, String gender, double weight) {
        super(nickName, gender, weight);
    }
}
