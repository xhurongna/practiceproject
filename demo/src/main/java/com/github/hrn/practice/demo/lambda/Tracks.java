package com.github.hrn.practice.demo.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 胡荣娜
 * @date 2019-12-30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tracks {
    private String name;
    private Integer length;
}
