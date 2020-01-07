package com.transport.visualizer.services;

import com.transport.visualizer.controllers.Position;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Chaklader on 2020-01-07
 */
@FeignClient(name = "fleetman-position-tracker")
public interface RemotePositionMicroserviceCalls {

    // REST Call
    // /vehicles/{name}
    @RequestMapping(method = RequestMethod.GET, value = "/vehicles/{name}")
    public Position getLatestPositionForVehicle(@PathVariable("name") String name);
}
