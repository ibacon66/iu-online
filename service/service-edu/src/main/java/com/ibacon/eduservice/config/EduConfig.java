package com.ibacon.eduservice.config;


import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ibacon.eduservice.mapper")
public class EduConfig {
    //逻辑删除插件
        @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }



}
