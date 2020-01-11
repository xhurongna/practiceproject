package com.github.hrn.practice.demo.lambda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 胡荣娜
 * @date 2020-01-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Track {
    private String name;
    private Integer length;
}
