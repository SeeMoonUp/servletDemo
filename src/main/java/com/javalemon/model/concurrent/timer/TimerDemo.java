package com.javalemon.model.concurrent.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author lemon(lemon @ laowantong.cc)
 * @date 2018-12-25
 * @desc
 */

public class TimerDemo {

    static Timer timer = new Timer();
    static TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            System.out.println(new Date());
            return;
        }
    };


    public static void main(String[] args) {
        System.out.println(new Date());
        timer.schedule(timerTask, 5000);

    }
}
