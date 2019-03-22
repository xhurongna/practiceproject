package com.github.hrn.practice.project.threadpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 胡荣娜
 * @date 2019/3/22
 */
public class ThreadPoolDemo {

    public static class MyTask implements Runnable {

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() + "-Thread ID:" + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.submit(myTask);
        }
    }
//    todo 第一次执行的结果如下，2个线程一组没问题，但并不是每个线程组之间相差1s,而是会超过1s：难道是因为线程上下文切换的耗时？
//    1553219238740-Thread ID:12
//1553219238740-Thread ID:13
//1553219239743-Thread ID:13
//1553219239743-Thread ID:12
//1553219240748-Thread ID:12
//1553219240748-Thread ID:13
//1553219241748-Thread ID:13
//1553219241748-Thread ID:12
//1553219242749-Thread ID:12
//1553219242749-Thread ID:13

}
