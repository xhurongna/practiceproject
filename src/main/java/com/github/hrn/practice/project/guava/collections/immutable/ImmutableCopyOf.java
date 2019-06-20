package com.github.hrn.practice.project.guava.collections.immutable;

import com.google.common.collect.ImmutableSet;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 胡荣娜
 * @date 2019-06-20
 */
public class ImmutableCopyOf {
    public static void main(String[] args) {
        Set<Color> colorSet = new HashSet<>();
        colorSet.add(new Color(0, 0, 0));
        colorSet.add(new Color(0, 255, 0));
        colorSet.add(new Color(0, 0, 255));
        colorSet.add(new Color(255, 0, 0));
        colorSet.add(new Color(255, 255, 0));
        colorSet.add(new Color(255, 0, 255));
        colorSet.add(new Color(255, 255, 255));
        System.out.println(colorSet.equals(ImmutableSet.copyOf(colorSet)));
    }
}
