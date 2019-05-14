package com.github.hrn.practice.project.threadpractice;

/**
 * @author 胡荣娜
 * @date 2019/3/18
 */
public class NewThread extends Thread implements Runnable{

    @Override
    public void run() {
        System.out.println("实现runnable创建线程");
    }

    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();

        
    }

}
