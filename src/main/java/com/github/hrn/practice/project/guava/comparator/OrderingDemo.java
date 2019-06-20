package com.github.hrn.practice.project.guava.comparator;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

/**
 * @author 胡荣娜
 * @date 2019-06-20
 */
public class OrderingDemo {

    public static void main(String[] args) {
        OrderingDemo demo = new OrderingDemo();
        System.out.println(demo.bylengthOrdering.compare("a","b"));
    }

     private Ordering<String> bylengthOrdering = new Ordering<String>() {
        @Override
        public int compare(String left, String right) {
            return Ints.compare(left.length(), right.length());
        }
    };
}
