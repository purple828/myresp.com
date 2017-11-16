package com.fllj;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by fff on 2017/11/15.
 */
public class ThreadPoolDemo {

    public static void main(String[] args){
        //定长线程池
        int poolaccount = Runtime.getRuntime().availableProcessors();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println("-----------"+poolaccount);
        for(int i=0;i<10;i++){
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        //延迟3秒执行代码
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);



        /*************1109加  系统自动开码单后将码单转换为图片保存 start***************/
//        final String orderId = createTo.getOrderId();
//        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(5);
//        threadPool.schedule(new Runnable() {
//            public void run() {
//                ApiOrderEcodeUrlQuery urlQuery = new ApiOrderEcodeUrlQuery();
//                urlQuery.setOrderId(orderId);
//                ApiSingleResult<ApiOrderEcodeUrlQuery> ecodeResult = orderService.printElectCode(urlQuery);
//                if(ecodeResult.isOk()){
//                    logger.info("将bps电子码单保存为图片并保存到数据库中");
//                }
//            }
//        },3,TimeUnit.SECONDS);

        /*************1109加  系统自动开码单后将码单转换为图片保存 end*****************/








    }





}
