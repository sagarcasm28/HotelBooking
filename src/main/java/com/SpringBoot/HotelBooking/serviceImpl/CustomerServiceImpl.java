package com.SpringBoot.HotelBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Customer;
import com.SpringBoot.HotelBooking.repository.CustomerRepository;
import com.SpringBoot.HotelBooking.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer fetch(Long customerId) {
		return customerRepository.findById(customerId).get();
	}

	@Override
	public List<Customer> fetchAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void delete(Long customerId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerId);
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
}
