package com.SpringBoot.HotelBooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Facility;

@Service
public interface FacilityService {

	public List<Facility> getFacilities(Long id);
	
	public void setFacilities(Long[] ids);
}
