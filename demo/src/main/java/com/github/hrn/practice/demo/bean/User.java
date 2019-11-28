package com.github.hrn.practice.demo.bean;

import com.google.common.base.MoreObjects;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("age", age)
                .add("accounts", accounts)
                .toString();
    }
}
