package com.github.hrn.practice.demo.guava.collections.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class ImmutableCollectionAsListDemo {

    public static void main(String[] args) {
        String abc = "好哇好哇";
        ImmutableList immutableList = ImmutableList.of(abc).asList();
        System.out.println("immutableList " + immutableList);

        ImmutableSortedSet immutableSortedSet = ImmutableSortedSet.of();
        immutableSortedSet.asList();
    }
}
