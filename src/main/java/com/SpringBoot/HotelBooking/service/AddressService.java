package com.SpringBoot.HotelBooking.service;

import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Address;

@Service
public interface AddressService {

	public Address save(Address address);
	
	public Address update(Address address);
	
	public Address fetch(Long addressId);
}
