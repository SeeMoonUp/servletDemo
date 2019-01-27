package com.javalemon.model.concurrent.ReentrantLockDemo;

import java.util.concurrent.TimeUnit;

/**
 * 示例一：同步锁的使用
 * reentrantlock用于替代synchronized
 * 本例中由于m1锁定this,只有m1执行完毕的时候,m2才能执行
 * @date 2018-12-04
 * @desc
 */
public class ReentrantLockOne {
    public synchronized void m1(){
        for(int i=0;i<10;i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public synchronized void m2(){
        System.out.println("hello m2!");
    }

    public static void main(String[] args) {
        final ReentrantLockOne lock=new ReentrantLockOne();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.m1();
            }
        }, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.m2();
            }
        }, "t2").start();
    }
}
