package com.github.hrn.practice.project.guavademo;

import com.google.common.base.Strings;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class StringsCommonPrefixOrSuffix {
    public static void main(String[] args) {
        System.out.println("字符串共同的前缀: " +  Strings.commonPrefix("com.ke.jiaoyi.topic", "com.ke.jiaoyi.question"));
        System.out.println("字符串共同的后缀: " + Strings.commonSuffix("i.dora.jiaoyi.ke.com", "dora.beke-off.lianjia.com"));
    }
}
