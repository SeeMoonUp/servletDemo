package com.javalemon.model.concurrent.CountDownLatchDemo;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-04
 * @desc
 */
public class CountDownLatchDemo {
    private static final int PLAYER_NUM=5;

    public static void main(String[] args) {

        CountDownLatch start=new CountDownLatch(1);
        CountDownLatch end =new CountDownLatch(PLAYER_NUM);
        Player [] players=new Player[PLAYER_NUM];

        for(int i=0;i<PLAYER_NUM;i++)
            players[i]=new Player(start, end, i);
        //指定线程个数的线程池！
        ExecutorService exe= Executors.newFixedThreadPool(PLAYER_NUM);
        for(Player player:players)
            exe.execute(player);

        System.out.println("比赛开始！");
        //比赛开始！
        start.countDown();

        try {
            end.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            System.out.println("比赛结束！");
            exe.shutdown();
        }
    }

}

class Player implements Runnable{
    private CountDownLatch start;
    private CountDownLatch end;
    private int id;

    Random random=new Random();
    public Player(CountDownLatch start,CountDownLatch end,int id) {
        this.start=start;
        this.end=end;
        this.id=id;
    }

    @Override
    public void run() {
        try {
            //等待比赛开始。
            start.await();
            TimeUnit.SECONDS.sleep(random.nextInt(10));
            System.out.println(System.currentTimeMillis() + "Player-"+id+":arrived");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            //选手-id到达终点,end计数为0结束比赛！
            end.countDown();
        }
    }
}
