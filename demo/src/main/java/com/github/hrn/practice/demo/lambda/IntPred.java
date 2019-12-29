package com.github.hrn.practice.demo.lambda;

import java.util.function.Predicate;

/**
 * @author 胡荣娜
 * @date 2019-12-29
 */
public interface IntPred {
    boolean test(Integer value);
    boolean check(Predicate<Integer> predicate);
    boolean check(IntPred predicate);
}
