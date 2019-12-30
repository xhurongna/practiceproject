package com.github.hrn.practice.demo.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 胡荣娜
 * @date 2019-12-30
 */
public class MinAndMax {

    public static void main(String[] args) {
        List<Tracks> tracks = Arrays.asList(new Tracks("Bakai", 524), new Tracks("Violets for you", 133), new Tracks("Time Was", 451));
        System.out.println(tracks.stream().min(Comparator.comparing(Tracks::getLength)));
        System.out.println(tracks.stream().max(Comparator.comparing(Tracks::getLength)));
    }
}
