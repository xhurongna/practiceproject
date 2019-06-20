package com.github.hrn.practice.project.guava.basicutilities.preconditions;

import com.github.hrn.practice.project.bean.User;
import com.google.common.base.Preconditions;

/**
 * @author 胡荣娜
 * @date 2019-06-17
 */
public class CheckState {
    public static void main(String[] args) {
        User user = new User();
        user.setId(5);
        Preconditions.checkState(user.getId() < 0, "当前id状态不对, id应小于0,传入的参数为 id=%s", user.getId());
    }
}
