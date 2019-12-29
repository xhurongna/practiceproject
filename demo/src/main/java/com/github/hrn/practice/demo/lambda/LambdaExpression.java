package com.github.hrn.practice.demo.lambda;

import org.junit.Assert;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 胡荣娜
 * @date 2019-12-28
 */
public class LambdaExpression {

    public static void main(String[] args) {
        Runnable helloWorld = () -> System.out.println("hello world");
        System.out.println(helloWorld);

        JButton button = new JButton();
        button.addActionListener(event -> System.out.println(event.getActionCommand()));

    }

}
