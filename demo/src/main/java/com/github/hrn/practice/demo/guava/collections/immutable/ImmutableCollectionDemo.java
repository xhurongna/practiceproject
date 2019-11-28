package com.github.hrn.practice.demo.guava.collections.immutable;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

/**
 * @author 胡荣娜
 * @date 2019-06-21
 */
public class ImmutableCollectionDemo {


    public static void main(String[] args) {
        Integer[] a = {1, 2};
        ImmutableCollection immutableCollection = ImmutableList.of(2,a);
        System.out.println(immutableCollection);
        System.out.println(immutableCollection.asList());
    }
}
