package com.taoyes3.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.taoyes3.hr.mapper")
public class HrServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrServerApplication.class, args);
    }

}
