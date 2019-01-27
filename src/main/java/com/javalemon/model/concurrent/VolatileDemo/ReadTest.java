package com.javalemon.model.concurrent.VolatileDemo;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-14
 * @desc
 */

public class ReadTest {
    volatile int testInt = 100;

    public static void main(String[] args) {
        final ReadTest rt = new ReadTest();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        rt.testInt++;
                    }

                }
            }).start();
        }
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(rt.testInt);

    }
}
