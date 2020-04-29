package com.SpringBoot.HotelBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.HotelBooking.processService.HotelBookingProcessService;

@RestController
public class HotelBookingController {

	private HotelBookingProcessService hotelBookingProcessService;

	@Autowired
	public HotelBookingController(HotelBookingProcessService hotelBookingProcessService) {
		this.hotelBookingProcessService = hotelBookingProcessService;
	}

	@PostMapping(value = "/customers/{customerId}/hotels/{hotelId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity createBooking(@PathVariable Long customerId, @PathVariable Long hotelId) {

		return hotelBookingProcessService.createBooking(customerId, hotelId);
	}

	@GetMapping(value = "/customers/{customerId}/bookings/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity fetchAllBooking(@PathVariable Long customerId) {

		return hotelBookingProcessService.fetchAllBooking(customerId);
	}

	@GetMapping(value = "/customers/{customerId}/bookings/{bookingId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity fetchBooking(@PathVariable Long customerId, @PathVariable Long bookingId) {

		return hotelBookingProcessService.fetchBooking(customerId, bookingId);
	}
}
