package com.fllj;

/**
 * Created by fff on 2017/11/14.
 */
public class ThreadDemo {

    public static void main(String[] args){
//        MyThread myThread = new MyThread();
//        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
//        Thread thread = new Thread(myThreadRunnable);
//        myThread.start();
//        thread.start();
//        MyThread mt1=new MyThread("T1");
//        MyThread mt2=new MyThread("T2");
////        mt1.run();
////        mt2.run();
//        mt1.start();
//        mt2.start();


        MyThreadRunnable mt=new MyThreadRunnable();
        Thread td1=new Thread(mt, "T1");
        Thread td2=new Thread(mt,"T2");
        Thread td3=new Thread(mt,"T3");
        td1.start();
        td2.start();
        td3.start();






    }
}
