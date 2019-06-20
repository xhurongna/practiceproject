package com.github.hrn.practice.project.guava.basicutilities.optional;

import com.github.hrn.practice.project.bean.User;
import com.google.common.base.Optional;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class OptionalOfDemo {

    public static void main(String[] args) {
        User user = new User();
        Optional<User> optionalUser = Optional.of(user);
        System.out.println(optionalUser.get());
    }

}
