package com.fllj.maketea;

/**
 * Created by fff on 2017/11/15.
 */
public class WashCupThread implements Runnable {
    public void run() {
        for(int i=1;i<6;i++){
            System.out.println("开始洗第"+i+"个杯子");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第"+i+"个杯子洗完咯");
        }
    }
}
