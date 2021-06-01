package ru.itsjava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class FruitHashMapPractise {
    public static void main(String[] args) {
//        Создать экземпляр HashMap (Ключ Имя покупателя Значение Фрукт)
        Map<Man, Fruit> fruitForManMap = new HashMap<>();
        Man javinskiy = new Man("Javinskiy");
        Man ivanovs = new Man("Ivanovs");
        Man arsikonis = new Man("Arsikonis");
        Man sidorovs = new Man("Arsikonis");
        Man latviyskiy = new Man("Latviyskiy");
//         1.Вставка элементов:
//         а). Добавить 5 фруктов
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


//        б). В новый экземпляр HashMap добавим старую карту
        Map<Man, Fruit> fruitForManMap2 = new HashMap<>(fruitForManMap);
//        2. Получение элемента по ключу (Получить любой фрукт по покупателю)
        System.out.println("----------------");
        System.out.println("fruitForManMap2.get(javinskiy) = " + fruitForManMap2.get(javinskiy));
        System.out.println("----------------");
//        3. Удаление элемента
//        а). Удалить любой фрукт
        System.out.println("fruitForManMap2.remove(javinskiy) = " + fruitForManMap2.remove(javinskiy));
        System.out.println("----------------");
//        4. Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)
        System.out.println("fruitForManMap2.containsKey(javinskiy) = " + fruitForManMap2.containsKey(javinskiy));
        System.out.println("----------------");
//        5. Вывод Map на экран:
//        a) Вывести все ключи (всех покупателей)
        for (Man man : fruitForManMap2.keySet()) {
            System.out.println("Man: " + man.getName());
        }
        System.out.println("----------------");
//        б) Вывести все значения (все фрукты)
        for (Fruit fruit : fruitForManMap2.values()) {
            System.out.println("Fruit: " + fruit.getName() + " ," + " Weight: " + fruit.getWeightKg());
        }
//        в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
        System.out.println("----------------");
        for (Map.Entry<Man, Fruit> mansFruits : fruitForManMap2.entrySet()) {
            System.out.println(mansFruits.getKey() + " " + mansFruits.getValue());
        }

    }
}
