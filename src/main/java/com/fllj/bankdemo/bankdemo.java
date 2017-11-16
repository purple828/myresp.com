package com.fllj.bankdemo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by fff on 2017/11/16.
 */
public class Bankdemo {

    private int account = 0;

    private ReentrantLock lock = new ReentrantLock();

    //存钱
    public synchronized void addMoney(int m){
        if(m>0){
            account +=m;
        }else{
            System.out.println("存入负数");
        }
        System.out.println(Thread.currentThread().getName()+"存进："+m);
    }

    //取钱
    public synchronized void subMoney(int n){
        if(account-n<=0){
            System.out.println("余额不足，请确认");
            return;
        }
        account -= n;
        System.out.println(Thread.currentThread().getName()+"取出："+n);
    }

    public  void lookMoney(){
        System.out.println("=======现在的账户余额======"+account);
    }


}
