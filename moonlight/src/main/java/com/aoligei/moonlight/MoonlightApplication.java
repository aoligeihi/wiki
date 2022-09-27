package com.aoligei.moonlight;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.aoligei.moonlight.mapper") // 注解方式设置mapper扫描路径
@SpringBootApplication
public class MoonlightApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoonlightApplication.class, args);
    }

}
