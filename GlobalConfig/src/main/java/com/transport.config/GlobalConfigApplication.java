package com.transport.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * @author Chaklader on 2020-01-07
 */
@EnableConfigServer
@SpringBootApplication
public class GlobalConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalConfigApplication.class, args);
    }
}
