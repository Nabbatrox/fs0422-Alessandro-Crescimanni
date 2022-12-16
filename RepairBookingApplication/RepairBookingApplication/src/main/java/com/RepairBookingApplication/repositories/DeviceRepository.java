package com.RepairBookingApplication.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RepairBookingApplication.models.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {


	
	
}
