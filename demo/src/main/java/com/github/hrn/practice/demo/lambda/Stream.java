package com.github.hrn.practice.demo.lambda;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 胡荣娜
 * @date 2019-12-29
 */
public class Stream {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println(list.stream().filter(x -> x > 5).collect(Collectors.toList()));
        //惰性求值操作
        list.stream().filter(a -> {
            System.out.println(a);
            return a > 5;
        });


        //及早求值操作
        list.stream().filter(a -> {
            System.out.println(a);
            return a > 5;
        }).count();
    }
}
