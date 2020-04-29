package com.SpringBoot.HotelBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.HotelBooking.processService.HotelProcessService;

@RestController
public class HotelController {

	private HotelProcessService hotelProcessService;

	@Autowired
	public HotelController(HotelProcessService hotelProcessService) {
		this.hotelProcessService = hotelProcessService;
	}

	@GetMapping(value = "/hotels/{hotelId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity fetchHotel(@PathVariable Long hotelId) {
		return hotelProcessService.fetchHotel(hotelId);
	}

	@GetMapping(value = "/hotels", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity fetchHoteList() {
		return hotelProcessService.fetchHoteList();
	}
}
