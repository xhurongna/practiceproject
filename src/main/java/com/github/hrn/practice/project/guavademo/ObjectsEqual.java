package com.github.hrn.practice.project.guavademo;

import com.google.common.base.Objects;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class ObjectsEqual {
    public static void main(String[] args) {
        System.out.println(Objects.equal(null, null));
        System.out.println(Objects.equal(new Integer(1), 1));
        System.out.println(Objects.equal(new Integer(129), new Integer(129)));
    }
}
