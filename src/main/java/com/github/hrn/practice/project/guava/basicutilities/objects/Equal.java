package com.github.hrn.practice.project.guava.basicutilities.objects;

import com.google.common.base.Objects;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class Equal {
    public static void main(String[] args) {
        System.out.println(Objects.equal(null, null));
        System.out.println(Objects.equal("aaa", new String("aaa")));
    }
}
