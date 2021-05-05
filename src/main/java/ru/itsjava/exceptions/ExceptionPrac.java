package ru.itsjava.exceptions;

public class ExceptionPrac {
    public static void main(String[] args) {
//        throw new RuntimeException("runtime exception");
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("Its Exception!");
//        } finally {
//            System.out.println("Finally!");
//        }
//        System.out.println("End");


//        try {
//            throw  new RuntimeException();
//        }catch (RuntimeException runExcep){
//            System.out.println("Run time Excep");
//        } catch (Throwable th){
//            System.out.println("Throwable");
//        }

        Calculator calculator = new Calculator();
        System.out.println("calculator.division(5,3) = " + calculator.division(5, 3));

        try {
            System.out.println("calculator.division(5,0) = " + calculator.division(5, 0));
        } catch (CalculatorExcep ce) {
            System.out.println("Вывели что то не то)!");
        }

    }

}
