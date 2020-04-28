package com.SpringBoot.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.HotelBooking.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
