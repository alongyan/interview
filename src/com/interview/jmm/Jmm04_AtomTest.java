package com.interview.jmm;

public class Jmm04_AtomTest {
    private static volatile int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    count++;
                }
            });
            t.start();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);

    }
}
