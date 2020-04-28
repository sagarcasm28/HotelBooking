package com.SpringBoot.HotelBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.HotelBooking.dtos.Customer;
import com.SpringBoot.HotelBooking.processService.CustomerProcessService;

@RestController
public class CustomerController {

	CustomerProcessService customerProcessService;

	@Autowired
	public CustomerController(CustomerProcessService customerProcessService) {
		this.customerProcessService = customerProcessService;
	}

	@PostMapping(value = "/customer/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity create(@RequestBody Customer customer) {
		//System.out.print("Bean created");
		return customerProcessService.processCreate(customer);
	}

	@GetMapping(value = "/customer/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity fetch(@PathVariable Long customerId) {
		return customerProcessService.processFetch(customerId);

	}

	@GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity fetchAll() {
		return customerProcessService.processFetchAll();
	}

	@DeleteMapping(value = "/customer/{customerId}")
	public ResponseEntity Delete(@PathVariable Long customerId) {
		return customerProcessService.processDelete(customerId);
	}

	@PutMapping(value = "/customer/{customerId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity update(@RequestBody Customer customer, @PathVariable Long customerId) {
		return customerProcessService.processUpdate(customer,customerId);
	}
}
