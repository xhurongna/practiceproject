package com.github.hrn.practice.project.guava.functional;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author 胡荣娜
 * @date 2019-06-25
 */
public class Collections2Demo {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("aa");
        arrList.add("bb");
        arrList.add("cc");

        System.out.println(Lists.newArrayList(Collections2.filter(arrList, Objects::nonNull)));
    }
}
