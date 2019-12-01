package com.github.hrn.practice.project.timeformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 胡荣娜
 * @date 2019-09-28
 */
public class TimeFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String string = "20190927";
        Date date = simpleDateFormat.parse(string);
        System.out.println(date);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat1.format(date));

    }
}

