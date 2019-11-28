package com.github.hrn.practice.demo.guava.strings;

import com.google.common.base.Joiner;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class StringJoiner {
    public static void main(String[] args) {
        System.out.println(Joiner.on(" ").join(new String[] {"hello", "world", "你好", "世界"}));
    }
}
