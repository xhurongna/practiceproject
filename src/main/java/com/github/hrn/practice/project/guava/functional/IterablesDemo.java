package com.github.hrn.practice.project.guava.functional;

import com.google.common.collect.Iterables;

import java.util.Objects;

/**
 * @author 胡荣娜
 * @date 2019-06-25
 */
public class IterablesDemo {
    public static void main(String[] args) {
        Iterables.all(null, input -> input != null);
        Iterables.any(null, Objects::isNull);
        Iterables.find(null, Objects::isNull);
        Iterables.tryFind(null, Objects::isNull);
        Iterables.consumingIterable(null);
    }
}
