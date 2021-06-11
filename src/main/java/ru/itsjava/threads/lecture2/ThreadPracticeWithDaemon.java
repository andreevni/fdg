package ru.itsjava.threads.lecture2;

public class ThreadPracticeWithDaemon {
    public static void main(String[] args) {
        Runnable runnableAnonymous = new Runnable() {
            @Override
            public void run() {

            }
        };

        Runnable runnable = () -> System.out.println("Hello Im Runnable!");
        new Thread(runnable).start();

        Runnable runnableWithDelay = () -> {
            for (int i = 0; i < 7; i++) {
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hi, I woke up after 4 seconds!");
            }
        };
        Thread threadWithDelay = new Thread(runnableWithDelay);
        threadWithDelay.setDaemon(true);
        threadWithDelay.start();


    }
}
