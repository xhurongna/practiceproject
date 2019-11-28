package com.github.hrn.practice.demo.guava.basicutilities.optional;

import com.google.common.base.Optional;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class OptionalOrNullDemo {
    public static void main(String[] args) {
        Optional optional = Optional.absent();
        System.out.println(optional.orNull());
    }
}
