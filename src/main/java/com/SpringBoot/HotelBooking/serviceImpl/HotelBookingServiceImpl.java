package com.SpringBoot.HotelBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.CustomerHotelMapping;
import com.SpringBoot.HotelBooking.repository.HotelBookingRepository;
import com.SpringBoot.HotelBooking.service.HotelBookingService;

@Service
public class HotelBookingServiceImpl implements HotelBookingService {

	private HotelBookingRepository hotelBookingRepository;

	@Autowired
	public HotelBookingServiceImpl(HotelBookingRepository hotelBookingRepository) {
		this.hotelBookingRepository = hotelBookingRepository;
	}

	@Override
	public CustomerHotelMapping fetchBooking(Long customerId, Long bookingId) {
		// TODO Auto-generated method stub
		return hotelBookingRepository.findCustomerHotelMappingByCustomerIdAndId(customerId, bookingId);
	}

	@Override
	public List<CustomerHotelMapping> fetchAllBooking(Long customerId) {
		// TODO Auto-generated method stub9
		return hotelBookingRepository.findCustomerHotelMappingByCustomerId(customerId);
	}

	@Override
	public CustomerHotelMapping save(CustomerHotelMapping bookingEntity) {
		// TODO Auto-generated method stub
		return hotelBookingRepository.save(bookingEntity);
	}

}
