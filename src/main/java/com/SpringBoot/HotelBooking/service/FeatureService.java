package com.SpringBoot.HotelBooking.service;

import org.springframework.stereotype.Service;

@Service
public interface FeatureService {

	public Integer[] getFeature(Long id);
	
	public Integer setFeature(Long[] ids);
}
