package com.github.hrn.practice.project.guava.collections.lists;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author 胡荣娜
 * @date 2019-06-30
 */
public class ListsDemo {
    public static void main(String[] args) {
        List<List<String>> listList = Lists.cartesianProduct(Lists.newArrayList("A"), Lists.newArrayList("B"));
        System.out.println(listList);
    }
}
