package ru.itsjava.collections.iterators;

import ru.itsjava.collections.maps.Fruit;
import ru.itsjava.collections.maps.Man;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorPractice {
    public static void main(String[] args) {
        Map<Man, Fruit> fruitForManMap = new HashMap<>();
        Man javinskiy = new Man("Javinskiy");
        Man ivanovs = new Man("Ivanovs");
        Man arsikonis = new Man("Arsikonis");
        Man sidorovs = new Man("Sidorovs");
        Man latviyskiy = new Man("Latviyskiy");

        Fruit apple = new Fruit("Apple", 0.80);
        Fruit banana = new Fruit("Banana", 0.110);
        Fruit orange = new Fruit("Orange", 0.230);
        Fruit waterMelon = new Fruit("Watermelon", 1.110);
        Fruit melon = new Fruit("Melon", 0.900);

        fruitForManMap.put(javinskiy, apple);
        fruitForManMap.put(ivanovs, melon);
        fruitForManMap.put(arsikonis, banana);
        fruitForManMap.put(sidorovs, orange);
        fruitForManMap.put(latviyskiy, waterMelon);

        Iterator<Map.Entry<Man, Fruit>> iterator1 = fruitForManMap.entrySet().iterator();
//        6. Отфильтровать Map вернуть записи по некоторому условию:
//        а) Условие на ключ: вернуть количество ключей длина которых больше 5 (покупателей, чье имя больше 5)
        int count = 0;
        while (iterator1.hasNext()) {
            Map.Entry<Man, Fruit> next1 = iterator1.next();
            if (next1.getKey().getName().length() > 5) {
                count++;
                System.out.println(count + ": " + next1.getKey());
            }
        }
//        б) Условие на значение: Вернуть количество элементов, которые равны "***" (фруктов, которые равны дыне)
        while (iterator1.hasNext()) {
            Map.Entry<Man, Fruit> next2 = iterator1.next();
            if (next2.getValue().getName().equalsIgnoreCase("melon")) {
                System.out.println(next2.getValue().getName());
            }
        }
//        7. Пропустить несколько элементов
//        а) Пропустить 2 элемента, значения которых Арбуз, все остальные вывести.
        while (iterator1.hasNext()) {
            Map.Entry<Man, Fruit> next3 = iterator1.next();
            if (!next3.getValue().getName().equalsIgnoreCase("watermelon") && !next3.getValue().getName().equalsIgnoreCase("melon")) {
                System.out.println(next3.getValue().getName());
            }
        }
//        б) Вывести все кроме 2 элементов, ключи которых начинаются на А
        while (iterator1.hasNext()) {
            Map.Entry<Man, Fruit> next4 = iterator1.next();
            if (!next4.getValue().getName().startsWith("A")) {
                System.out.println(next4.getValue().getName());
            }
        }
//        8. Вернуть первый подходящий элемент:
//        а) Возвращаем элемент значение которого арбуз или Арбуз или АРбУз.
        while (iterator1.hasNext()) {
            Map.Entry<Man, Fruit> next5 = iterator1.next();
            if (next5.getValue().getName().equalsIgnoreCase("watermelon")) {
                System.out.println(next5.getValue().getName());
            }
        }
//      9. Возвращаем все элементы удовлетворяющие условию:
//      а) Возвращаем все элементы в другую карту, которые являются фруктами (не получилось)
        Map<Man, Fruit> fruitForMan2 = new HashMap<>();
        Iterator<Map.Entry<Man, Fruit>> iterator2 = fruitForMan2.entrySet().iterator();
        fruitForMan2.putAll(fruitForManMap);
//        10. Найти средний вес всех фруктов.
        double sum = 0;
        while (iterator2.hasNext()) {
            Map.Entry<Man, Fruit> next6 = iterator1.next();
            sum += next6.getValue().getWeightKg();
        }
        System.out.println(sum / 5);
    }
}
