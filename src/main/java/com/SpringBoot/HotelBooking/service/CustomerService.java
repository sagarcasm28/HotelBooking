package com.SpringBoot.HotelBooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Customer;

@Service
public interface CustomerService {

	public Customer save(Customer customer);
	
	public Customer fetch(Long customerId);
	
	public List<Customer> fetchAll();
	
	public void delete(Long customerId);
	
	public Customer update(Customer customer);
}
