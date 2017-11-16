package com.fllj.maketea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by fff on 2017/11/15.
 */
public class MakeTeaDemo {

    public  static void main(String[] args){
        BoilThread boil = new BoilThread();
        WashCupThread washCup = new WashCupThread();
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()+2);
        executorService.execute(boil);
        executorService.execute(washCup);
    }
}
