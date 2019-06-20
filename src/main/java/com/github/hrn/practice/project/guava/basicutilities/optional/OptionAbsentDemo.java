package com.github.hrn.practice.project.guava.basicutilities.optional;

import com.google.common.base.Optional;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class OptionAbsentDemo {
    public static void main(String[] args) {
        Optional<Employee> employeeOptional = Optional.absent();
        employeeOptional.get();
    }

    public static class Employee {
        private Integer userCode;
        private String userName;
        private Integer age;
        private String address;

    }
}
