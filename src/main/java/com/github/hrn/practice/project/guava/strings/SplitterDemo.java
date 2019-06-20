package com.github.hrn.practice.project.guava.strings;

import com.google.common.base.Splitter;

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
