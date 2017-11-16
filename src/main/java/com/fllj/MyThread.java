package com.fllj;

/**
 * Created by fff on 2017/11/14.
 */
public class MyThread extends Thread {

    private String threadName;
    private int num=10;
    public MyThread(String threadName){
        this.threadName=threadName;
    }
    public void run() {
        while(num>0){
            System.out.println(this.threadName+": "+num);
            num--;
        }
    }



//    @Override
//    public void run() {
//        for(int i=0;i<10;i++) {
//            System.out.println(Thread.currentThread().getName()+":"+i);
//            try{
//                Thread.sleep(2000);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//
//        }
//    }

}
