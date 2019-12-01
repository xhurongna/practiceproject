package com.github.hrn.practice.demo.guava.strings;

import com.google.common.base.Joiner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class StringJoiner {
    public static void main(String[] args) {
        String a = Joiner.on(" ").join(new String[]{"hello", "world", "你好", "世界"});
        Map<String, Object> map = new HashMap<>();
        map.put("a", "HaHa");
        map.put("b", "HeiHei");
        String b = Joiner.on('#').withKeyValueSeparator("#").join(map);
        System.out.println(a);
        System.out.println(b);
    }
}
