package com.SpringBoot.HotelBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.HotelBooking.entities.Hotel;
import com.SpringBoot.HotelBooking.repository.HotelRepository;
import com.SpringBoot.HotelBooking.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	private HotelRepository hotelRepository;
	
	@Autowired
	public HotelServiceImpl(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public Hotel fetchHotel(Long hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public List<Hotel> fetchHoteList() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel save(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}

}
