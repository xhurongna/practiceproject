package com.github.hrn.practice.project.guava.collections.immutable;

import com.google.common.collect.FluentIterable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡荣娜
 * @date 2019-06-26
 */
public class FluentIterableDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("哈哈哈");
        strings.add("呵呵呵");
        System.out.println(FluentIterable.from(strings));;
    }
}

