package com.fllj;

/**
 * Created by fff on 2017/11/14.
 */
public class MyThreadRunnable implements Runnable {
    private int num=10;

    public void run() {
        // TODO Auto-generated method stub
        while(num>0){
            System.out.println(Thread.currentThread().getName()+": "+num);
            num--;
        }
    }


//    public void run() {
//        for(int i=0;i<10;i++) {
//            System.out.println(Thread.currentThread().getName()+"----Runnable--"+i);
//            try{
//                Thread.sleep(2000);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
}
