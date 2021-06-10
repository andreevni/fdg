package ru.itsjava.threads;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
@AllArgsConstructor
public class PrintJava implements Runnable {
    private final String message;
    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            Thread.sleep(delay);
            System.out.print(message + " ");
        }
    }
}
