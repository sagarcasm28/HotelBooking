package com.SpringBoot.HotelBooking.processService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.dtos.Customer;

@Service
public interface CustomerProcessService {

	public ResponseEntity processCreate(Customer customer);

	public ResponseEntity processFetch(Long customerId);

	public ResponseEntity processFetchAll();

	public ResponseEntity processDelete(Long customerId);

	public ResponseEntity processUpdate(Customer customer, Long customerId);
}
