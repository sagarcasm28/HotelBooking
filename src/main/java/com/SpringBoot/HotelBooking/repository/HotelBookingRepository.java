package com.SpringBoot.HotelBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.HotelBooking.entities.CustomerHotelMapping;

public interface HotelBookingRepository extends JpaRepository<CustomerHotelMapping, Long> {

	public List<CustomerHotelMapping> findCustomerHotelMappingByCustomerId(Long customerId);

	public CustomerHotelMapping findCustomerHotelMappingByCustomerIdAndId(Long customerId, Long bookingId);

}
