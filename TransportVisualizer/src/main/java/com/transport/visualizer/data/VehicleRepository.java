package com.transport.visualizer.data;

import com.transport.visualizer.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Chaklader on 2020-01-05
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
	
	public Vehicle findByName(String name);
} 
