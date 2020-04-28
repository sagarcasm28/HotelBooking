package com.SpringBoot.HotelBooking.processService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.dtos.Address;

@Service
public interface AddressProcessService {
	
	public ResponseEntity fetch(Long customerId, Long addressId);

	public ResponseEntity update(Long customerId, Long addressId, Address address);
}
