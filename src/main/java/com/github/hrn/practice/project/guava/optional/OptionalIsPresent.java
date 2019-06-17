package com.github.hrn.practice.project.guava.optional;

import com.github.hrn.practice.project.bean.User;
import com.google.common.base.Optional;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class OptionalIsPresent {
    public static void main(String[] args) {
        User user = new User();
        Optional optional = Optional.of(user);
        System.out.println(optional.isPresent());
        optional = Optional.fromNullable(null);
        System.out.println(optional.isPresent());
        optional = Optional.of(4);
        System.out.println(optional.isPresent());
        optional = Optional.absent();
        System.out.println(optional.isPresent());
    }
}
