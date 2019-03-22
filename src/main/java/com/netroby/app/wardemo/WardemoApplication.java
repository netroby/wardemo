package com.netroby.app.wardemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class WardemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WardemoApplication.class, args);
    }

}
