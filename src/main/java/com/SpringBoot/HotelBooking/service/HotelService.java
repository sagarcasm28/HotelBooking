package com.SpringBoot.HotelBooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Hotel;

@Service
public interface HotelService {

	public List<Hotel> fetchHoteList();

	public Hotel fetchHotel(Long hotelId);
	
	public Hotel save(Hotel hotel);
}
