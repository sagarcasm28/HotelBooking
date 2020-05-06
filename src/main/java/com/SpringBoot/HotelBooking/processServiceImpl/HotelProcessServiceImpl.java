package com.SpringBoot.HotelBooking.processServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Facility;
import com.SpringBoot.HotelBooking.entities.Hotel;
import com.SpringBoot.HotelBooking.processService.HotelProcessService;
import com.SpringBoot.HotelBooking.service.FacilityService;
import com.SpringBoot.HotelBooking.service.HotelService;

@Service
public class HotelProcessServiceImpl implements HotelProcessService {

	private HotelService hotelService;

	private FacilityService facilityService;

	@Autowired
	public HotelProcessServiceImpl(HotelService hotelService, FacilityService facilityService) {
		this.hotelService = hotelService;
		this.facilityService = facilityService;
	}

	@Override
	public ResponseEntity fetchHotel(Long hotelId) {
		// TODO Auto-generated method stub
		Hotel hotel = hotelService.fetchHotel(hotelId);
		List<Facility> facilityList = facilityService.getFacilities(hotel.getFacilites());
		hotel.setFacilityList(facilityList);
		return new ResponseEntity(hotel, HttpStatus.OK);
	}

	@Override
	public ResponseEntity fetchHoteList() {
		// TODO Auto-generated method stub
		List<Hotel> hotelList = hotelService.fetchHoteList();
		
		for(Hotel hotel: hotelList) {
			List<Facility> facilityList = facilityService.getFacilities(hotel.getFacilites());
			hotel.setFacilityList(facilityList);
		}
		return new ResponseEntity(hotelList, HttpStatus.OK);
	}

}
