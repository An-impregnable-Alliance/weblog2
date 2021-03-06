package com.sound.weblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sound.weblog.mapping") //扫描的mapper
@SpringBootApplication
public class WeblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeblogApplication.class, args);
    }

}
