package com.github.hrn.practice.project.guava.preconditions;

import com.github.hrn.practice.project.bean.User;
import com.google.common.base.Preconditions;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class CheckPositionIndex {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("哈哈");
        user.setAge(19);
        String[] accounts = {"账号1", "账号2"};
        user.setAccounts(accounts);
        int a = 2;
        Preconditions.checkPositionIndex(a, user.getAccounts().length, a + "必须<账户大小" + user.getAccounts().length);
        System.out.println("index作为位置值 位置合法，index作为索引值，从0开始算，作为位置值，从0开始算, 位置值最大值可以取长度值，但截取的结果是不包含该位置");
        Preconditions.checkElementIndex(a, user.getAccounts().length, a + "必须<账户大小" + user.getAccounts().length);
    }
}
