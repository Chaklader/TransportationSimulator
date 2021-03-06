package com.transport.tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author Chaklader on 2020-01-07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class VehicleTrackingApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleTrackingApplication.class, args);
    }
}
