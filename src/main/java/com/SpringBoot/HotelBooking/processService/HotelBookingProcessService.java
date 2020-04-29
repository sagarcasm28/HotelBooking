package com.SpringBoot.HotelBooking.processService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface HotelBookingProcessService {

	public ResponseEntity createBooking(Long customerId, Long hotelId);

	public ResponseEntity fetchAllBooking(Long customerId);

	public ResponseEntity fetchBooking(Long customerId, Long bookingId);
}