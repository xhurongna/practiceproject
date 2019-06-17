package com.github.hrn.practice.project.guava.preconditions;

import com.google.common.base.Preconditions;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class CheckPositionIndexes {
    public static void main(String[] args) {
        String[] array = {"字符数组0", "字符数组1", "字符数组2"};
        System.out.println("就是[start, end)是[0, array.length)的子集");
        Preconditions.checkPositionIndexes(0, 3, array.length);
    }
}
