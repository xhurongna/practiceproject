package com.github.hrn.practice.demo.guava.collections.map;

import com.google.common.base.Joiner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class MapJoin {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        String mapJoinResult = Joiner.on(",").withKeyValueSeparator("=").join(map);
        System.out.println(mapJoinResult);
    }
}
