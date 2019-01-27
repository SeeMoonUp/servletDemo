package com.javalemon.model.concurrent.deadlock;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-25
 * @desc
 */

public class SyncLock {
    private static Executor executor = Executors.newFixedThreadPool(5);
    static Object lock = new Object();

    public static void main(String[] args) {
        Task task1 = new Task();
        Task task2 = new Task();
        executor.execute(task1);
        executor.execute(task2);
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                calculate();
            }
        }

        public void calculate() {
            int i = 0;
            while (true) {
                i++;
            }
        }
    }
}
