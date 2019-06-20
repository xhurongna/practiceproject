package com.github.hrn.practice.project.guava.basicutilities.preconditions;

import com.github.hrn.practice.project.bean.User;
import com.google.common.base.Preconditions;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class CheckNotNull {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        String[] accounts = {"账号1", "账号2"};
        user.setAccounts(accounts);

        Preconditions.checkNotNull(user.getAccounts(), "accounts不能为空，传入的参数accounts为 " + user);
    }
}
