package com.SpringBoot.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.HotelBooking.entities.Facility;

@Repository
public interface FacilityRepsitory extends JpaRepository<Facility, Long> {
 
	public Facility findByFacilityId(Long id);
}
