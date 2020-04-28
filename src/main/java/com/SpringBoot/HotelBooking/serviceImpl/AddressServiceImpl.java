package com.SpringBoot.HotelBooking.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Address;
import com.SpringBoot.HotelBooking.repository.AddressRepository;
import com.SpringBoot.HotelBooking.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;
	
    @Autowired
	public AddressServiceImpl(AddressRepository addressRepository) {
	this.addressRepository = addressRepository;
}

	@Override
	public Address save(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

	@Override
	public Address update(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

	@Override
	public Address fetch(Long addressId) {
		// TODO Auto-generated method stub
		return addressRepository.findById(addressId).get();
	}


}
