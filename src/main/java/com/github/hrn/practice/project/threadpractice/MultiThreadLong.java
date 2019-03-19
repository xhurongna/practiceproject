package com.github.hrn.practice.project.threadpractice;

/**
 * @author 胡荣娜
 * @date 2019/3/19
 */
//todo 运行该程序，必须在32位的Java虚拟机上。因为long 类型是64位。查看JVM是多少位的方法：https://www.breakyizhan.com/java/3588.html
public class MultiThreadLong {
    public static long t = 0;

    public static class ChangeT implements Runnable {
        private long to;

        public ChangeT(long to) {
            this.to = to;
        }

        @Override
        public void run() {
            while (true) {
                MultiThreadLong.t = to;
                Thread.yield();
            }
        }
    }

    public static class ReadT implements Runnable {

        @Override
        public void run() {
            while (true) {
                long tmp = MultiThreadLong.t;
                if (tmp != 111L && tmp != -999L && tmp != 333L && tmp != -444L) {
                    System.out.println(tmp);
                    Thread.yield();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ChangeT(111L)).start();
        new Thread(new ChangeT(-999L)).start();
        new Thread(new ChangeT(333L)).start();
        new Thread(new ChangeT(-444L)).start();
        new Thread(new ReadT()).start();
        System.out.println(System.getProperty("sun.arch.data.model"));
    }
}
