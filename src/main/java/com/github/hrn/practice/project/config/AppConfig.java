package com.github.hrn.practice.project.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author 胡荣娜
 * @date 2019/2/15
 */
@Configuration
@Data
public class AppConfig {
    @Value("${config.path}")
    private String configPath;
}
