package ru.itsjava.threads;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(2000L);
//            System.out.println("a");
//        }
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000L);
//            System.out.println("b");
//        }

//        PrinterThread printerThreadA = new PrinterThread("A", 2000L);
////        PrinterThread printerThreadB = new PrinterThread("B", 3000L);
//
//
//        PrinterRunnable printerRunnable = new PrinterRunnable("B", 3000L);
//        Thread threadB = new Thread(printerRunnable);
//
//        System.out.println("Start");
//
//        printerThreadA.start();
//        threadB.start();
//
//        threadB.join();
//        System.out.println("End");


        PrintLearn printLearn = new PrintLearn("Learn", 5000L);

        PrintJava printJava = new PrintJava("Java!", 5000L);
        Thread threadJava = new Thread(printJava);

        System.out.println("Start");
        printLearn.start();
        threadJava.start();

        threadJava.join();
        System.out.println("End");
    }
}
