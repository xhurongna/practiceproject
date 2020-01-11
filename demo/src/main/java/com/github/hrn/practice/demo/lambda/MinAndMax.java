package com.github.hrn.practice.demo.lambda;

import com.github.hrn.practice.demo.lambda.model.Track;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 胡荣娜
 * @date 2019-12-30
 */
public class MinAndMax {

    public static void main(String[] args) {
        List<Track> tracks = Arrays.asList(new Track("Bakai", 524), new Track("Violets for you", 133), new Track("Time Was", 451));
        System.out.println(tracks.stream().min(Comparator.comparing(Track::getLength)));
        System.out.println(tracks.stream().max(Comparator.comparing(Track::getLength)));
    }
}
