package ru.itsjava.Object;

public class Animals {

    public static void main(String[] args) {
        // Создал два новых животных типа Слон))) с одинаковой последовательностью символов и изменил значения в классе Elephant
// для equals и hashcode
        Elephant elephant1 = new Elephant("Elephant", 90);
        Animals elephant2 = new Elephant("Elephant", 90);
        System.out.println("elephant1.equals(elephant2) = " + elephant1.equals(elephant2));

//  Создаю три новых животных типа Жираф но не меняю значение для equals и hashcode в классе Giraffe
        Animals giraffe1 = new Giraffe("Yellow and Brown");
        Animals giraffe2 = new Giraffe("Yellow and Brown");
        Animals giraffe3 = new Giraffe("Yellow and Brown and yellow again");

        giraffe1 = giraffe3; // присвоил ссылку giraffe1 giraff у 3 ему)

//        Ну и так как значение для методов hashcode и equals в классе Giraffe не менялось в данном случае будут сравниваться
// ссылки
        System.out.println("giraffe1.equals(giraffe2) = " + giraffe1.equals(giraffe2));
        System.out.println("giraffe1.equals(elephant1) = " + giraffe1.equals(elephant1));

//        Тут ссылки равны так как выше было присвоено значение ссылки от жирафа1 к жирафу 3
        System.out.println("giraffe1.equals(giraffe3) = " + giraffe1.equals(giraffe3));


// у жирафа переопределил toString() вручную и проверил)
        System.out.println("giraffe1.toString() = " + giraffe1.toString());
//  у слонов) с помощью библиотеки Lombok @Data
        System.out.println("elephant2.toString() = " + elephant2.toString());
        System.out.println("elephant1.getElephantName() = " + elephant1.getElephantName());
        elephant1.setElephantName("elph11");
        System.out.println("elephant1.getElephantName() = " + elephant1.getElephantName());


    }
}
