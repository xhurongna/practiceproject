package com.github.hrn.practice.demo.lambda;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author 胡荣娜
 * @date 2019-12-29
 */
public class Map {

    public static void main(String[] args) {
        List<String> collectedList = Lists.newArrayList();
        List<String> lowCase = Arrays.asList("a", "b", "Hello");
        for (String str: Arrays.asList("a", "b", "Hello")) {
            String upperCase = str.toUpperCase();
            collectedList.add(upperCase);
        }
        System.out.println(collectedList);

        System.out.println(lowCase.stream().map(String::toUpperCase).collect(toList()));;
    }
}
