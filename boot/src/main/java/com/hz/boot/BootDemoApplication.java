package com.hz.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author huangzhi
 */
@SpringBootApplication
@ComponentScan(value = "com.hz.server.*")
@MapperScan(value="com.hz.server.test.mapper.*")
@EnableScheduling
public class BootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class, args);
    }

}
