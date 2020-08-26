package com.interview.jvm;

public class DeadLockTest {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (lock1){
                try {
                    System.out.println("Thread 1 begin");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("Thread 1 end");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (lock2){
                try {
                    System.out.println("Thread 2 begin");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("Thread 2 end");
                }
            }
        }).start();

        System.out.println("Main thread end");
    }
}
