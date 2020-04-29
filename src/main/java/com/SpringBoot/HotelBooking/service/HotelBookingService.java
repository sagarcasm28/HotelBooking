package com.SpringBoot.HotelBooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.CustomerHotelMapping;

@Service
public interface HotelBookingService {


	public List<CustomerHotelMapping> fetchAllBooking(Long customerId);

	public CustomerHotelMapping fetchBooking(Long customerId, Long bookingId);

	public CustomerHotelMapping save(CustomerHotelMapping bookingEntity);
}
