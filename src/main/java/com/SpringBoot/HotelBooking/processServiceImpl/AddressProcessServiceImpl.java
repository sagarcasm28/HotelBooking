package com.SpringBoot.HotelBooking.processServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.dtos.Address;
import com.SpringBoot.HotelBooking.processService.AddressProcessService;
import com.SpringBoot.HotelBooking.service.AddressService;

@Service
public class AddressProcessServiceImpl implements AddressProcessService {

	private AddressService addressService;

	@Autowired
	public AddressProcessServiceImpl(AddressService addressService) {
		this.addressService = addressService;
	}

	@Override
	public ResponseEntity fetch(Long customerId, Long addressId) {
		// TODO Auto-generated method stub
		return new ResponseEntity(addressService.fetch(addressId), HttpStatus.OK);
	}

	@Override
	public ResponseEntity update(Long customerId, Long addressId, Address address) {
		
		com.SpringBoot.HotelBooking.entities.Address address1 = addressService.fetch(addressId);
		address1.setCity(address.getCity());
		address1.setCountry(address.getCountry());
		address1.setStreet(address.getStreet());
		return new ResponseEntity(addressService.update(address1), HttpStatus.OK);
	}
}
