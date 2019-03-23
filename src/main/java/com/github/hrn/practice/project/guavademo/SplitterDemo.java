package com.github.hrn.practice.project.guavademo;

import com.google.common.base.Splitter;

import java.util.Map;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class SplitterDemo {
    public static void main(String[] args) {
        Iterable<String> splitResults = Splitter.onPattern("[,，]{1,}").trimResults().omitEmptyStrings().split("hello,world,,世界，水平");
        for (String item: splitResults) {
            System.out.println(item);
        }
    }
}
