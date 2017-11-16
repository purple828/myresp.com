package com.fllj.bankdemo;

/**
 * Created by fff on 2017/11/16.
 */
public class SysBankDemo {

    public static void main(String[] args){

        final Bankdemo bank = new Bankdemo();
        //存钱线程
        Thread addThread = new Thread(new Runnable() {
            public void run() {

                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    bank.addMoney(100);
                    bank.lookMoney();
                    System.out.println("\n");

                }

            }
        });

        //取钱线程
        Thread subThread = new Thread(new Runnable() {
            public void run() {

                while(true){
                    bank.subMoney(100);
                    bank.lookMoney();
                    System.out.println("\n");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });
        addThread.setName("存钱");
        subThread.setName("取钱");
        addThread.start();
        subThread.start();

    }


}
