package com.ibacon.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangxin
 * @Description APP启动类
 * @createTime 2022年12月20日 21:04:00
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.ibacon"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class);
    }
}
