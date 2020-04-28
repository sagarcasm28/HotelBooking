package com.SpringBoot.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.HotelBooking.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
