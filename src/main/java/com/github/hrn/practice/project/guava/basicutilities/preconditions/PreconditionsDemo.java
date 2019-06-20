package com.github.hrn.practice.project.guava.basicutilities.preconditions;

import com.github.hrn.practice.project.bean.User;
import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class PreconditionsDemo {

    public static void main(String[] args) {
        User user = new User();
        user.setId(0);
        user.setName("哈哈");
        user.setAge(19);
        String[] accounts = {"账号1", "账号2"};
        user.setAccounts(accounts);
//        checkAllArguments(user);

        List<User> userList = new ArrayList<>();
        userList.add(user);

        User user1 = new User();
        user1.setId(1);
        userList.add(user1);

        User user2 = new User();
        user2.setId(2);
        userList.add(user2);

        User user3 = new User();
        user3.setId(3);
        userList.add(user);
        System.out.println(userList);

        System.out.println(userList.get(2));
        System.out.println(userList.subList(0,2));
    }


    public static void checkAllArguments(User user) {
        Preconditions.checkArgument(user.getId() > 0, "id cannot be less than 0, id is %s", user.getId());
        Preconditions.checkNotNull(user.getName(), "name cannot be null");
        Preconditions.checkArgument(user.getName().length() < 5, "用户名称不得超过5", 5);
        Preconditions.checkState(user.getId() > 0, "当前id状态不对");
        Preconditions.checkPositionIndex(2, user.getAccounts().length, "用户账号 positionIndex");
        Preconditions.checkElementIndex(1, user.getAccounts().length, "用户账号 elementIndex");
        System.out.println("通过验证");
    }

}
