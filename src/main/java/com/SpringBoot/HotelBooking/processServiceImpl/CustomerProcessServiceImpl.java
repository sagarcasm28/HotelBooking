package com.SpringBoot.HotelBooking.processServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.dtos.Customer;
import com.SpringBoot.HotelBooking.entities.Address;
import com.SpringBoot.HotelBooking.processService.AddressProcessService;
import com.SpringBoot.HotelBooking.processService.CustomerProcessService;
import com.SpringBoot.HotelBooking.service.AddressService;
import com.SpringBoot.HotelBooking.service.CustomerService;

@Service
public class CustomerProcessServiceImpl implements CustomerProcessService {

	public final CustomerService customerService;
	
	private final AddressService addressService;

   @Autowired
	public CustomerProcessServiceImpl(CustomerService customerService, AddressService addressService) {
		this.customerService = customerService;
		this.addressService = addressService;
	}

	@Override
	public ResponseEntity processCreate(Customer customer) {
		
		Address addressEntity = new Address();
		addressEntity.setCity(customer.getAddress().getCity());
		addressEntity.setCountry(customer.getAddress().getCountry());
		addressEntity.setStreet(customer.getAddress().getStreet());
		
		Long addressId = addressService.save(addressEntity).getId();
		com.SpringBoot.HotelBooking.entities.Customer customer1 = new com.SpringBoot.HotelBooking.entities.Customer();
		customer1.setEmailId(customer.getEmailId());
		customer1.setGender(customer.getGender());
		customer1.setName(customer.getName());
		customer1.setPhoneNumber(customer.getNumber());
		customer1.setAddressId(addressId);
		//customer1.setAddressId(addressService.update(address));
		return new ResponseEntity(customerService.save(customer1), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity processFetch(Long customerId) {
		// TODO Auto-generated method stub
		
		return new ResponseEntity(customerService.fetch(customerId), HttpStatus.OK);
	}

	@Override
	public ResponseEntity processFetchAll() {
		// TODO Auto-generated method stub
		return new ResponseEntity(customerService.fetchAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity processDelete(Long customerId) {
		customerService.delete(customerId);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public ResponseEntity processUpdate(Customer customer, Long customerId) {
		// TODO Auto-generated method stub
		com.SpringBoot.HotelBooking.entities.Customer customer1 = customerService.fetch(customerId);
		customer1.setEmailId(customer.getEmailId());
		customer1.setGender(customer.getGender());
		customer1.setName(customer.getName());
		customer1.setPhoneNumber(customer.getNumber());
		
		return new ResponseEntity(customerService.save(customer1), HttpStatus.OK);
	}

}
