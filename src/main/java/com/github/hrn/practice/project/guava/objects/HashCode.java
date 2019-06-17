package com.github.hrn.practice.project.guava.objects;

import com.google.common.base.Objects;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class HashCode {
    public static void main(String[] args) {
        final String aa = "aa";
//        System.out.println(java.util.Objects.hash(aa));
        System.out.println(Objects.hashCode(aa));
    }
}
