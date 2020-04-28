package com.SpringBoot.HotelBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.HotelBooking.dtos.Address;
import com.SpringBoot.HotelBooking.processService.AddressProcessService;

@RestController
public class AddressController {

	private AddressProcessService addressProcessService;

	@Autowired
	public AddressController(AddressProcessService addressProcessService) {
		this.addressProcessService = addressProcessService;
	}

	@GetMapping(value = "/customer/{customerId}/address/{addressId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity fetch(@PathVariable Long customerId, @PathVariable Long addressId) {
		// System.out.print("Bean created");
		return addressProcessService.fetch(customerId, addressId);
	}

	@PutMapping(value = "/customer/{customerId}/address/{addressId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity update(@PathVariable Long customerId, @PathVariable Long addressId,
			@RequestBody Address address) {
		// System.out.print("Bean created");
		return addressProcessService.update(customerId, addressId, address);
	}
}
