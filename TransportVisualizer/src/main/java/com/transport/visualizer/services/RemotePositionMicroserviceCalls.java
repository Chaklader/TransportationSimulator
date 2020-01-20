package com.transport.visualizer.services;

import com.transport.visualizer.models.Position;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Chaklader on 2020-01-07
 */
@FeignClient(name = "fleetman-position-tracker")
public interface RemotePositionMicroserviceCalls {

    @GetMapping(value = "/vehicles/{name}")
    public Position getLatestPositionForVehicle(@PathVariable(value = "name") String name);
}
