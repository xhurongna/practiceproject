package com.github.hrn.practice.project.guava.basicutilities.comparator;

import com.google.common.collect.Ordering;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 胡荣娜
 * @date 2019-06-20
 */
public class UsingToString {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        Iterable iterable = new Iterable() {
            @Override
            public Iterator iterator() {
                return iterator;
            }
        };

        System.out.println(Ordering.usingToString().lexicographical().reverse());
        System.out.println(Ordering.allEqual().max("ddbb", "aa", "cc", "dd"));
        System.out.println(Ordering.natural().reverse());
        System.out.println(iterable);
        System.out.println(Ordering.allEqual().isOrdered(iterable));
//        System.out.println(Ordering.natural().min(iterable));


    }
}
