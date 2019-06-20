package com.github.hrn.practice.project.guava.basicutilities.optional;

import com.google.common.base.Optional;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class OptionalOrDemo {
    public static void main(String[] args) {
        Optional optional = Optional.absent();
        System.out.println(optional.or("因为引用缺失，返回的指定值"));
    }
}
