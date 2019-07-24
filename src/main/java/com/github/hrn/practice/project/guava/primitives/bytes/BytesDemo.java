package com.github.hrn.practice.project.guava.primitives.bytes;

import com.google.common.primitives.Bytes;

/**
 * @author 胡荣娜
 * @date 2019-06-25
 */
public class BytesDemo {

    public static void main(String[] args) {
        byte[] aaList = {new Byte(String.valueOf(1)), new Byte(String.valueOf(2))};
//        System.out.println(Bytes.asList(aaList));
//        System.out.println(Bytes.contains(aaList, (byte) 127));
        System.out.println(Bytes.hashCode((byte) 258));
        System.out.println(Bytes.indexOf(aaList, (byte) 2));
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println((byte) 255);
    }
}
