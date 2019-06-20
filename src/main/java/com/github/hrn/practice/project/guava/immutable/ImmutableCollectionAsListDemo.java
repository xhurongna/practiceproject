package com.github.hrn.practice.project.guava.immutable;

import com.google.common.collect.ImmutableList;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class ImmutableCollectionAsListDemo {

    public static void main(String[] args) {
        String abc = "好哇好哇";
        ImmutableList immutableList = ImmutableList.of(abc).asList();
        System.out.println("immutableList " + immutableList);
    }
}
