package com.github.hrn.practice.project.guava;

import com.google.common.base.Strings;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class StringsPadStrAndPadEnd {
    public static void main(String[] args) {
        System.out.println(Strings.padStart("123", 6, '0'));
        System.out.println(Strings.padEnd("000", 10, 'a'));
    }
}
