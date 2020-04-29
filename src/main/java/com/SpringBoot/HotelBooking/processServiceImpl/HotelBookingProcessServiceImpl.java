package com.SpringBoot.HotelBooking.processServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.CustomerHotelMapping;
import com.SpringBoot.HotelBooking.entities.Hotel;
import com.SpringBoot.HotelBooking.processService.HotelBookingProcessService;
import com.SpringBoot.HotelBooking.service.HotelBookingService;
import com.SpringBoot.HotelBooking.service.HotelService;

@Service
public class HotelBookingProcessServiceImpl implements HotelBookingProcessService {

	private HotelBookingService hotelBookingService;
	private HotelService hotelService;

	@Autowired
	public HotelBookingProcessServiceImpl(HotelBookingService hotelBookingService, HotelService hotelService) {
		this.hotelBookingService = hotelBookingService;
		this.hotelService = hotelService;
	}

	@Override
	public ResponseEntity createBooking(Long customerId, Long hotelId) {
		// TODO Auto-generated method stub
		Hotel hotel = hotelService.fetchHotel(hotelId);
		hotel.setIsAvailable(false);
		hotelService.save(hotel);

		CustomerHotelMapping bookingEntity = new CustomerHotelMapping();
		bookingEntity.setCustomerId(customerId);
		bookingEntity.setHotelId(hotelId);
		return new ResponseEntity(hotelBookingService.save(bookingEntity), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity fetchAllBooking(Long customerId) {
		// TODO Auto-generated method stub
		List<CustomerHotelMapping> bookingList = hotelBookingService.fetchAllBooking(customerId);
		return new ResponseEntity(bookingList, HttpStatus.ACCEPTED.OK);
	}

	@Override
	public ResponseEntity fetchBooking(Long customerId, Long bookingId) {
		// TODO Auto-generated method stub
		return new ResponseEntity(hotelBookingService.fetchBooking(customerId, bookingId), HttpStatus.OK);
	}
}
