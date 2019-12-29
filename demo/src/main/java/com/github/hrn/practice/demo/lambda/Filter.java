package com.github.hrn.practice.demo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.isDigit;

/**
 * @author 胡荣娜
 * @date 2019-12-29
 */
public class Filter {

    public static void main(String[] args) {
        List<String> beginningWithNumbers = new ArrayList<>();
        for (String value : Arrays.asList("a", "1abc", "abc1")) {
            if (isDigit(value.charAt(0))) {
                beginningWithNumbers.add(value);
            }
        }

        List<String> list = Arrays.asList("a", "1abc", "abc1");
        list = list.stream().filter(x -> isDigit(x.charAt(0))).collect(Collectors.toList());

        System.out.println(beginningWithNumbers);
        System.out.println(list);
    }
}

