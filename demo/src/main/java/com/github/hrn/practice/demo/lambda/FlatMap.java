package com.github.hrn.practice.demo.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 胡荣娜
 * @date 2019-12-29
 */
public class FlatMap {
    public static void main(String[] args) {
        System.out.println(Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).flatMap(value -> value.stream()).collect(Collectors.toList()));
        System.out.println(Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).flatMap(Collection::stream).collect(Collectors.toList()));
    }
}
