package com.transport.visualizer.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.visualizer.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
	
	public Vehicle findByName(String name);
} 
