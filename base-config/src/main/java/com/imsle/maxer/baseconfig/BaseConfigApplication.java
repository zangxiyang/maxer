package com.imsle.maxer.baseconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BaseConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseConfigApplication.class, args);
    }

}
