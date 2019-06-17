package com.github.hrn.practice.project.guava.eventbus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageEventDemo implements Serializable {
    private static final long serialVersionUID = 2365035903761956988L;
    private String message;
}
