package com.transport.visualizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Chaklader on 2020-01-07
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroservicesRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesRegistryApplication.class, args);
    }
}
