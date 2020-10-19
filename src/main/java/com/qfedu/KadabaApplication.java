package com.qfedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.qfedu.dao")
@EnableTransactionManagement  //springboot添加事务
public class KadabaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KadabaApplication.class, args);
    }

}
