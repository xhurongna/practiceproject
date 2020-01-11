package com.github.hrn.practice.demo.lambda;

import com.github.hrn.practice.demo.lambda.model.Album;
import com.github.hrn.practice.demo.lambda.model.Track;
import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

/**
 * @author 胡荣娜
 * @date 2020-01-11
 */
public class IntegrationOperation {
    public static void main(String[] args) {
        List<Album> albums = Lists.newArrayList();
        List<Track> trackList = Lists.newArrayList();
        trackList.add(new Track("甜蜜蜜", 61));
        trackList.add(new Track("我心依旧", 65));
        trackList.add(new Track("我心永恒", 40));
        trackList.add(new Track("天黑黑", 70));
        albums.add(new Album().setTracks(trackList));
        IntegrationOperation integrationOperation = new IntegrationOperation();
        System.out.println(integrationOperation.findLongTracks(albums));
        System.out.println(integrationOperation.findLongTrackByLambda(albums));
    }


    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();
        for (Album album : albums) {
            for (Track track : album.getTracks()) {
                if (track.getLength() > 60) {
                    String name = track.getName();
                    trackNames.add(name);
                }
            }
        }
        return trackNames;
    }

    public Set<String> findLongTrackByLambda(List<Album> albums) {
        return albums.stream().flatMap(album -> album.getTracks().stream().filter(track -> track.getLength() > 60)).map(Track::getName).collect(toSet());
    }

}
