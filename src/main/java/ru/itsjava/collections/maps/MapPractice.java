package ru.itsjava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man,String> man = new HashMap<>();
        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man javov = new Man("Javov");
        man.put(ivanov,"T-shirt");
        man.put(sidorov,"Sweatshirt");
        man.put(javov,"Sweater");

        for(Map.Entry<Man, String> pair: man.entrySet()){
            System.out.println(pair.getKey()+ ": " + pair.getValue());
        }
        System.out.println("man.remove(ivanov) = " + man.remove(ivanov));
        System.out.println("-------------");
        for(Man keyMan :man.keySet()){
            System.out.println(keyMan + " : " + man.get(keyMan));
        }
        System.out.println("-------------");
        System.out.println("man.size() = " + man.size());
        System.out.println(man.isEmpty());
        System.out.println("-------------");
        man.replace(javov,"Sweater", "Gloves");
        System.out.println("man.get(javov) = " + man.get(javov));
        man.clear();
        man.size();


    }
}
