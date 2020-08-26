package com.cantarino.of;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients
public class OfApplication {

    public static void main(String[] args) {
        SpringApplication.run(OfApplication.class, args);





    }


}
