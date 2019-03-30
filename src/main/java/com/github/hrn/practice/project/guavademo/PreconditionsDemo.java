package com.github.hrn.practice.project.guavademo;

import com.google.common.base.Preconditions;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class PreconditionsDemo {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("哈哈");
        user.setAge(19);
        String[] accounts = {"账号1", "账号2"};
        user.setAccounts(accounts);
        checkAllArguments(user);
    }


    public static void checkAllArguments(User user) {
        Preconditions.checkArgument(user.getId() > 0, "id cannot be less than 0");
        Preconditions.checkNotNull(user.getName(), "name cannot be null");
        Preconditions.checkArgument(user.getName().length() < 5, "用户名称不得超过5", 5);
        Preconditions.checkState(user.getId() > 0, "当前id状态不对");
        Preconditions.checkPositionIndex(2, user.getAccounts().length, "用户账号 positionIndex");
        Preconditions.checkElementIndex(1, user.getAccounts().length, "用户账号 elementIndex");
        System.out.println("通过验证");
    }

    public static class User {
        private int id;
        private String name;
        private int age;
        private String[] accounts;

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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String[] getAccounts() {
            return accounts;
        }

        public void setAccounts(String[] accounts) {
            this.accounts = accounts;
        }
    }
}
