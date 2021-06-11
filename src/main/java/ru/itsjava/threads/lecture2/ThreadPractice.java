package ru.itsjava.threads.lecture2;

public class ThreadPractice {
    public static void main(String[] args) {
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello form anonymous class!");
            }
        };

        anonymousRunnable.run();
        Thread thread = new Thread(anonymousRunnable);
        thread.start();


        Runnable functionalRunnable = () -> System.out.println("Hello form functional prog!");
        new Thread(functionalRunnable).start();

//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(3000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Hello hello again!");
//            }
//        }).start();

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello hello again!");
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
       Thread thread1 = new Thread(runnable);
       thread1.setDaemon(true);
       thread1.start();




    }
}
