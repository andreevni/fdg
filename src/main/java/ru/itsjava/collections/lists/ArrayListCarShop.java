package ru.itsjava.collections.lists;

import java.util.*;

public class ArrayListCarShop {
    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();
        Car car1 = new Car("Jaguar F-Type", 300);
        Car car2 = new Car("Ferrari F8", 340);
        Car car3 = new Car("Audi Q7", 280);
        Car car4 = new Car("BMW Series 7", 310);
        Car car5 = new Car("Mercedes E220", 320);

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);

        System.out.println("Добро пожаловать в магазин эксклюзивных автомобилей!");
        printMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер в меню: ");
        int menuNum = scanner.nextInt();

        while (true) {
            if (menuNum == 1) {
                printAllCars(carsList);
            } else if (menuNum == 2) {
                buyCar(carsList, scanner);
                scanner.nextInt();
            } else if (menuNum == 3) {
                sellCar(carsList, scanner);
                scanner.nextInt();


            } else if (menuNum == 4) {
                System.out.println("Ждем вас снова!");
                System.exit(0);
            }
            System.out.println();
            printMenuAgain();
            System.out.println("Введите номер в меню:");
            menuNum = scanner.nextInt();

        }
    }

    public static void printMenu() {
        System.out.println("""
                Наше консольное Меню :
                1.Посмотреть все машины.
                2.Купить машину.
                3.Вернуть машину.
                4.Выйти из магазина.""");
    }

    public static void printMenuAgain() {
        System.out.println("""
                Меню:
                1.Посмотреть еще раз все машины.
                2.Купить машину.
                3.Вернуть машину.
                4.Выйти из магазина.""");
    }

    public static void printAllCars(List<Car> cars) {
        int count = 0;
        System.out.println("Наши машины : ");
        for (Car car : cars) {
            count++;
            System.out.println(count + "." + car);
        }
    }

    public static void buyCar(List<Car> carsList, Scanner console) {
        System.out.println("Введите номер машины для покупки :");
        Car removeCar;
        if (console.hasNext("1")) {
            removeCar = carsList.remove(0);
            System.out.println("Поздравляем с покупкой нового Jaguar!\n" + removeCar);
        } else if (console.hasNext("2")) {
            removeCar = carsList.remove(1);
            System.out.println("Поздравляем с покупкой нового Ferrari!\n" + removeCar);
        } else if (console.hasNext("3")) {
            removeCar = carsList.remove(2);
            System.out.println("Поздравляем с покупкой нового Audi!\n" + removeCar);
        } else if (console.hasNext("4")) {
            removeCar = carsList.remove(3);
            System.out.println("Поздравляем с покупкой нового BMW!\n" + removeCar);
        } else if (console.hasNext("5")) {
            removeCar = carsList.remove(4);
            System.out.println("Поздравляем с покупкой нового Mercedes!\n" + removeCar);
        } else {
            System.out.println("Такой машины нет!");
        }
    }

    public static void sellCar(List<Car> carList, Scanner console) {
        System.out.println("Какую машину вы хотите вернуть?");
        Car car1 = new Car("Jaguar F-Type", 300);
        Car car2 = new Car("Ferrari F8", 340);
        Car car3 = new Car("Audi Q7", 280);
        Car car4 = new Car("BMW Series 7", 310);
        Car car5 = new Car("Mercedes E220", 320);


        if (console.hasNext("1")) {
            carList.add(0, car1);
            System.out.println("Припаркуем Jaguar обратно в салон)\n" + car1);
        } else if (console.hasNext("2")) {
            carList.add(1, car2);
            System.out.println("Припаркуем Ferrari обратно в салон)\n" + car2);
        } else if (console.hasNext("3")) {
            carList.add(2, car3);
            System.out.println("Припаркуем Audi обратно в салон)\n" + car3);
        } else if (console.hasNext("4")) {
            carList.add(3, car4);
            System.out.println("Припаркуем BMW обратно в салон)\n" + car4);
        } else if (console.hasNext("5")) {
            carList.add(4, car5);
            System.out.println("Припаркуем Mercedes обратно в салон)\n" + car5);
        } else {
            System.out.println("Такой машины у нас не покупали)");
        }
    }
}




