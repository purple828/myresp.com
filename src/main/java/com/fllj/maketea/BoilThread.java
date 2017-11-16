package com.fllj.maketea;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by fff on 2017/11/15.
 */
public class BoilThread implements Runnable{
    public void run() {
        System.out.println("--------开始烧水--------");
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors());
        scheduledExecutorService.schedule(new Runnable() {
            public void run() {
                System.out.println("--------水烧好了--------");
            }
        },10, TimeUnit.SECONDS);
    }
}
