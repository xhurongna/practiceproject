package com.github.hrn.practice.demo.guava.strings;

import com.google.common.base.Strings;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class StringsIsNullOrEmpty {
    public static void main(String[] args) {
//        null 或者 空字符串， 空格是是视为字符串的
        System.out.println(Strings.isNullOrEmpty(null));
        System.out.println(Strings.isNullOrEmpty(""));
        System.out.println(Strings.isNullOrEmpty(" "));
    }
}
