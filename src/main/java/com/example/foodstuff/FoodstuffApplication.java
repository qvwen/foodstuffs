package com.example.foodstuff;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.foodstuff.dao")
public class FoodstuffApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodstuffApplication.class, args);
    }

}
