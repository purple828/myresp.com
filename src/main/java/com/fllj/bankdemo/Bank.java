package com.fllj.bankdemo;

/**
 * Created by fff on 2017/11/16.
 */
public class Bank {

    private int count =0;//账户余额

    //存钱
    public  synchronized void addMoney(int money){
        count +=money;
        System.out.println(System.currentTimeMillis()+"存进："+money);
    }

    //取钱
    public  synchronized void subMoney(int money){
        if(count-money < 0){
            System.out.println("余额不足");
            return;
        }
        count -=money;
        System.out.println(+System.currentTimeMillis()+"取出："+money);
    }

    //查询
    public synchronized void lookMoney(){
        System.out.println("账户余额："+count);
    }
}