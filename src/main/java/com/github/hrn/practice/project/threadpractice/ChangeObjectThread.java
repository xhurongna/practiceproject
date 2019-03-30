package com.github.hrn.practice.project.threadpractice;

/**
 * @author 胡荣娜
 * @date 2019/3/20
 */
public class ChangeObjectThread extends Thread {
    volatile boolean stopMe = false;

    public static User user = new User();

    public void stopMe() {
        this.stopMe = true;
    }

    @Override
    public void run() {
        while (true) {
            if (stopMe) {
                System.out.println("exit by stop me");
                break;
            }
            synchronized (user) {
                int v = (int) (System.currentTimeMillis()/1000);
                user.setId(v);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                user.setName(String.valueOf(v));
            }
            Thread.yield();
        }
    }

    public static class User {
        private int id;
        private String name;

        public User() {
            id = 0;
            name = "0";
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ChangeObjectThread().start();
        while (true) {
            ChangeObjectThread t = new ChangeObjectThread();
            t.start();
            Thread.sleep(150);
            t.stopMe();
        }
    }
}
