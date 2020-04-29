package com.SpringBoot.HotelBooking.processServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Hotel;
import com.SpringBoot.HotelBooking.processService.HotelProcessService;
import com.SpringBoot.HotelBooking.service.HotelService;

@Service
public class HotelProcessServiceImpl implements HotelProcessService {

	private HotelService hotelService;

	@Autowired
	public HotelProcessServiceImpl(HotelService hotelService) {
		this.hotelService = hotelService;
	}

	@Override
	public ResponseEntity fetchHotel(Long hotelId) {
		// TODO Auto-generated method stub
		return new ResponseEntity(hotelService.fetchHotel(hotelId), HttpStatus.OK);
	}

	@Override
	public ResponseEntity fetchHoteList() {
		// TODO Auto-generated method stub
		List<Hotel> hotelList = hotelService.fetchHoteList();
	   return new ResponseEntity(hotelList, HttpStatus.OK);
	}

}
