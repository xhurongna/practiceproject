package com.github.hrn.practice.demo.guava.basicutilities.preconditions;

import com.github.hrn.practice.demo.bean.User;
import com.google.common.base.Preconditions;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class CheckArgument {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);

        Preconditions.checkArgument(user.getId() < 0, "id不能大于0, 传入的参数id为 %s", user.getId());

    }
}
