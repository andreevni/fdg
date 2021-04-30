package ru.itsjava.Object;

import lombok.*;

import java.util.Objects;
@Data
@AllArgsConstructor
public class Dog {
    private final String nickName;
    private int pawsCount;

//    public Dog(String nickName, int pawsCount){
//        this.nickName=nickName;
//        this.pawsCount=pawsCount;
//
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Dog)) return false;
//        Dog dog = (Dog) o;
//        return nickName.equals(dog.nickName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nickName);
//    }
//    @Override
//    public String toString(){
//        return "Dog{ nickname: " + nickName+ ", paws count: " + pawsCount + "}";
//    }
}
