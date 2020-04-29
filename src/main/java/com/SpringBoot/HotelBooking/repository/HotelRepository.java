package com.SpringBoot.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.HotelBooking.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
