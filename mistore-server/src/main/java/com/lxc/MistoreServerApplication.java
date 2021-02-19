package com.lxc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.lxc")
@MapperScan("com.lxc.dao")
@EnableScheduling   //开启定时任务
public class MistoreServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MistoreServerApplication.class, args);
    }

}