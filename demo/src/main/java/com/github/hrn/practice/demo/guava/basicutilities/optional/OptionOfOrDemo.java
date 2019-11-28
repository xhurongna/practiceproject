package com.github.hrn.practice.demo.guava.basicutilities.optional;

import com.google.common.base.Optional;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class OptionOfOrDemo {
    public static void main(String[] args) {
        System.out.println(Optional.of("aaa").or("根本不会缺失"));
        System.out.println(Optional.fromNullable(null).or("引用缺失"));
        System.out.println(Optional.absent().or("引用缺失"));

    }
}
