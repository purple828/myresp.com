package com.fllj;

/**
 * Created by fff on 2017/11/14.
 */
public class SynchronizeTest implements Runnable {

    int num1 = 10;
    int num2 = 10;
    int num3 = 10;

    public void synchonized_test() {
        synchronized(this) {
            System.out.println(this);
            while(num1 > 0) { //只有得到锁的线程才能访问
                System.out.println(Thread.currentThread().getName() + "访问num1=" + num1--);
            }
        }
        synchronized(this) { //只有得到锁的线程才能访问，即使它还没有开始访问这儿，因为同步锁的作用对象是对象中的所有同步块
            while(num2 > 0) {
                System.out.println(Thread.currentThread().getName() + "访问num2=" + num2--);
            }
        }
        while(num3 > 0) { //未得到锁的线程可访问此资源（非同步块）
            System.out.println(Thread.currentThread().getName() + "访问num3=" + num3--);
        }


    }
    public void run() {
        synchonized_test();

    }


    public static void main(String[] args) {
        SynchronizeTest sys = new SynchronizeTest();
        Thread t1 = new Thread(sys);
        Thread t2 = new Thread(sys);
        t1.start();
        t2.start();


    }
}
