package com.fllj;

/**
 * Created by fff on 2017/11/16.
 */
public class bankdemo {

    private int account = 0;

    //存钱
    public void addMoney(int m){
        if(m>0){
            account +=m;
        }else{
            System.out.println("不能存入负数");
        }
        System.out.println("现在的账户余额为："+account);
    }

    //取钱
    public void subMoney(int n){
        if(account-n<=0){
            System.out.println("余额不足，请确认");
            return;
        }
        account -= n;
        System.out.println("现在的账户余额为："+account);
    }


}
