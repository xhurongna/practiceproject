package com.github.hrn.practice.project.guava.collections.immutable;

import com.google.common.collect.ImmutableList;

/**
 * @author 胡荣娜
 * @date 2019-06-21
 */
public class ImmutableListDemo {
    public static void main(String[] args) {
        ImmutableList<String> immutableList = ImmutableList.<String>builder().add("a").add("b").build();
        System.out.println(immutableList);
    }
}
