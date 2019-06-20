package com.github.hrn.practice.project.guava.strings;

import com.google.common.base.Splitter;

import java.util.Map;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class SplitterKeyValueSeprator {
    public static void main(String[] args) {

        String toSplitString = "a=b;c=d,e=f";
        Map<String, String> kvs = Splitter.onPattern("[,;]{1,}").withKeyValueSeparator('=').split(toSplitString);
        for (Map.Entry<String, String> entry : kvs.entrySet()) {
            System.out.println(String.format("%s:%s", entry.getKey(), entry.getValue()));
        }
    }
}
