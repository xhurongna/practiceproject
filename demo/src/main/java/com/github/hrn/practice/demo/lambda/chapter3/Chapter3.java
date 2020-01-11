package com.github.hrn.practice.demo.lambda.chapter3;

import com.github.hrn.practice.demo.lambda.model.Album;
import com.github.hrn.practice.demo.lambda.model.Artist;
import com.github.hrn.practice.demo.lambda.model.Track;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author 胡荣娜
 * @date 2020-01-11
 */
public class Chapter3 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        System.out.println("*****addUp***** " + addUp(stream));

        List<Artist> artistList =
                Lists.newArrayList(new Artist("周杰伦", null, "中国"), new Artist("孙燕姿", null, "新加坡"), new Artist("赵兆", null, "中国"));
        System.out.println("*****getArtistNationalityAndName*****" + getArtistNationalityAndName(artistList));

        List<Album> albums = Lists.newArrayList();
        List<Track> trackList = Lists.newArrayList();
        trackList.add(new Track("甜蜜蜜", 1));
        trackList.add(new Track("我心依旧", 2));
        trackList.add(new Track("我心永恒", 3));
        trackList.add(new Track("天黑黑", 4));
        albums.add(new Album().setTracks(trackList));
        System.out.println("*****getMaximum3Album*****  " + getMaximum3Album(albums));

        System.out.println("*****getMembersCount***** " + getMembersCount(artistList));

        String testString = "AB判断字符串中有几个小写字母";
        String testString2 = "AB找出字符串列表中有最多小写字母的字符串";
        System.out.println("******countLowerCase(testString)****** " + countLowerCase(testString));


        System.out.println(findStringContainsMaxLowerCase(Lists.newArrayList("")));

    }


    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(Integer::sum).get();
    }

    public static List<String> getArtistNationalityAndName(List<Artist> artistList) {
        List<String> str1 = artistList.stream().map(artist -> artist.getName() + "-" + artist.getOrigin()).collect(toList());
        List<String> str2 = artistList.stream().flatMap(artist -> Stream.of(artist.getName(), artist.getOrigin())).collect(toList());
        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);
        return str2;
    }

    public static List<Album> getMaximum3Album(List<Album> albumList) {
        return albumList.stream().filter(album -> album.getTracks().size() <= 3).collect(toList());
    }

    public static long getMembersCount(List<Artist> artists) {
        return artists.stream().flatMap(Artist::getMembers).count();
    }

    public int getMembersCount0(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        return totalMembers;
    }

//    public void testForEach(Album album) {
//        AtomicInteger count = new AtomicInteger(0);
//        List<String> origins = album.getMusicians().forEach(
//                musician -> count.incrementAndGet());
//
//    }

    public static long countLowerCase(String string) {
        return string.chars().filter(Character::isLowerCase).count();
//        return string.chars().filter(a -> Character.isLowerCase(a)).count();
    }

    public static Optional<String> findStringContainsMaxLowerCase(List<String> stringList) {
        Optional<String> optionalS = stringList.stream().reduce(BinaryOperator.maxBy((Comparator.comparingLong(o -> o.chars().filter(Character::isLowerCase).count()))));
        Optional<String> optionalS1 = stringList.stream().max(Comparator.comparing(Chapter3::countLowerCase));
        System.out.println("optionalS*** " + optionalS);
        System.out.println("optionalS1*** " + optionalS1);
        return optionalS1;
    }

    public static List<String> lambdaMap(List<Album> albums) {
        return albums.stream().map(Album::getName).collect(toList());
    }

    public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
        return stream.reduce(new ArrayList<O>(), (acc, x) -> {
            List<O> newAcc = new ArrayList<>(acc);
            newAcc.add(mapper.apply(x));
            return newAcc;
        }, (List<O> left, List<O> right) -> {
            List<O> newLeft = new ArrayList<>(left);
            newLeft.addAll(right);
            return newLeft;
        });
    }

    public static <T, R> List<R> overrideMap(Stream<T> stream, Function<T, R> mapper) {
        return stream.reduce(new ArrayList<R>(), (acc, x) -> {
            List<R> newAcc = new ArrayList<>(acc);
            newAcc.add(mapper.apply(x));
            return newAcc;
        }, (List<R> left, List<R> right) -> {
            List<R> newLeft = new ArrayList<>(left);
            newLeft.addAll(right);
            return newLeft;
        });
    }

    public static <T> List<T> overrideFilter(Stream<T> stream, Predicate<T> predicate) {
        return stream.reduce(new ArrayList<T>(), (List<T> acc, T x) -> {
            if (predicate.test(x)) {
                List<T> newAcc = new ArrayList<>();
                newAcc.add(x);
                return newAcc;
            } else {
                return acc;
            }
        }, (List<T> left, List<T> right) -> {
            List<T> newLeft = new ArrayList<>(left);
            newLeft.addAll(right);
            return newLeft;
        });
    }
}
