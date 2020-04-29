package com.SpringBoot.HotelBooking.processService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Hotel;

@Service 
public interface HotelProcessService {

	public ResponseEntity<List<Hotel>> fetchHoteList();

	public ResponseEntity fetchHotel(Long hotelId);
}
