package com.github.hrn.practice.project.guava.optional;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class OptionalAsSet {
    public static void main(String[] args) {
        OptionalOfDemo.User user = new OptionalOfDemo.User();
        user.setId(1);
        user.setName("hhh");

        OptionalOfDemo.User user2 = new OptionalOfDemo.User();
        user2.setId(2);
        user2.setName("gggg");

        List<OptionalOfDemo.User> userList = ImmutableList.of(user, user2, user);


        Optional optional = Optional.of(userList);
        System.out.println(optional.asSet());

        optional = Optional.absent();
        System.out.println(optional.asSet());

//        Set<OptionalOfDemo.User> userSet = ImmutableSet.of(user, user2, user);
//        System.out.println(userSet);
    }
}
