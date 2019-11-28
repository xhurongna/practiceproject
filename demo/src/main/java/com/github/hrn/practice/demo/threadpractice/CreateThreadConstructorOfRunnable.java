package com.github.hrn.practice.demo.threadpractice;

/**
 * @author 胡荣娜
 * @date 2019/3/18
 */
public class CreateThreadConstructorOfRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现runnable接口，构造函数使用Runnable");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThreadConstructorOfRunnable());
        thread.start();
    }
}
