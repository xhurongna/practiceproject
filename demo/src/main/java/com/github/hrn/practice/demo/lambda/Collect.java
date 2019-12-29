package com.github.hrn.practice.demo.lambda;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 胡荣娜
 * @date 2019-12-29
 */
public class Collect {

    public static void main(String[] args) {
        List<String> collectList = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println(collectList);

        Assert.assertEquals(Arrays.asList("b", "a", "c"), collectList);
    }
}
