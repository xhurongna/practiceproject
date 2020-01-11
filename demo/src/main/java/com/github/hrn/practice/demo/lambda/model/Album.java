package com.github.hrn.practice.demo.lambda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author 胡荣娜
 * @date 2020-01-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Album {
    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;
}
