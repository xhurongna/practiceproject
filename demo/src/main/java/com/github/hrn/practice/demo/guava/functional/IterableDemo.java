package com.github.hrn.practice.demo.guava.functional;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 胡荣娜
 * @date 2019-06-25
 */
public class IterableDemo {
    public static void main(String[] args) {
        Iterable iterable = new Iterable() {
            @Override
            public Iterator iterator() {
                LinkedList<String> linkedList = new LinkedList<>();
                linkedList.add("initLinkedList");
                return linkedList.iterator();
            }
        };
        System.out.println(iterable.iterator().next());
    }
}
