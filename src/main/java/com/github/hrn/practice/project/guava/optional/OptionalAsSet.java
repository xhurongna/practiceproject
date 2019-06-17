package com.github.hrn.practice.project.guava.optional;

import com.github.hrn.practice.project.bean.User;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class OptionalAsSet {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("hhh");

        User user2 = new User();
        user2.setId(2);
        user2.setName("gggg");

        List<User> userList = ImmutableList.of(user, user2, user);


        Optional optional = Optional.of(userList);
        System.out.println(optional.asSet());

        optional = Optional.absent();
        System.out.println(optional.asSet());

//        Set<OptionalOfDemo.User> userSet = ImmutableSet.of(user, user2, user);
//        System.out.println(userSet);
    }
}
