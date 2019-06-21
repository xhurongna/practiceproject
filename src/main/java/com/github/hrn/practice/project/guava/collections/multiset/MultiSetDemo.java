package com.github.hrn.practice.project.guava.collections.multiset;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 胡荣娜
 * @date 2019-06-21
 */
public class MultiSetDemo {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("c");
        multiset.add("d");
        multiset.add("b");
        multiset.add("a");
        multiset.add("a");

        Set<String> stringSet = new HashSet<>();
        stringSet.add("a");
        stringSet.add("c");
        stringSet.add("d");
        stringSet.add("a");
        System.out.println(multiset);
        System.out.println(stringSet);
    }
}
