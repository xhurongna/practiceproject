package com.github.hrn.practice.project.guava.immutable;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class ImmutableDemo {
    public static void main(String[] args) {
        Set<String> immutableSet = ImmutableSet.<String>builder().add("aa").add("bb").build();
        System.out.println("ImmutableSet.<String>builder().add(\"aa\").add(\"bb\").build()");
        for (String set : immutableSet) {
            System.out.println(set);
        }

        Set<String> immutableSet2 = ImmutableSet.of("aa", "bb", "cc");
        System.out.println("ImmutableSet.of(\"aa\", \"bb\", \"cc\")");
        for (String set : immutableSet2) {
            System.out.println(set);
        }

        Set<String> immutableSet3 = ImmutableSet.copyOf(new String[] {"哈哈", "呵呵呵", "O(∩_∩)O哈哈~"});
        System.out.println("ImmutableSet.copyOf(array)");
        for (String set : immutableSet3) {
            System.out.println(set);
        }
    }
}
