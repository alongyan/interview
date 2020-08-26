package com.interview.aqs;

import java.util.concurrent.Semaphore;

public class SemaphoreRunner {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 10; i++) {
            new Thread(new Task(semaphore, "线程+" + i)).start();
        }
    }

    static class Task extends Thread {
        Semaphore semaphore;

        public Task(Semaphore semaphore, String tname) {
            this.semaphore = semaphore;
            this.setName(tname);
        }

        public void run() {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + ":aquire() at time:" + System.currentTimeMillis());
                Thread.sleep(1000);
                semaphore.release();
                System.out.println(Thread.currentThread().getName() + ":aquire() at time:" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
