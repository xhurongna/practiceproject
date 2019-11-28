package com.github.hrn.practice.demo.guava.functional;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 胡荣娜
 * @date 2019-06-25
 */
public class FunctionDemo {
    public static void main(String[] args) {
        List<String> aaList = new LinkedList<>();
        aaList.add("aa");
        aaList.add("bb");
        aaList.add("cc");
        aaList.add("dd");
        for (String s : aaList) {
            System.out.println(s);
        }
    }

}
