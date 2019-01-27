package com.javalemon.model.concurrent.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-25
 * @desc 死锁演示
 */

public class DeadLock {

    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        lock1.lock();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        lock2.lock();
                    }
                }, "myThread1");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock2.lock();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock1.lock();
            }
        }, "myThread2");

        thread1.start();
        thread2.start();
    }
}
