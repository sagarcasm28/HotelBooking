package com.SpringBoot.HotelBooking.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_hotel_mapping")
public class CustomerHotelMapping {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "hotel_id" )
	private Long hotelId;
	
	@Column(name = "from_date")
	private Date fromDate;
	
	@Column(name = "till_date")
	private Date tillDate;
	
	public Long getId() {
		return id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public Date getTillDate() {
		return tillDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public void setTillDate(Date tillDate) {
		this.tillDate = tillDate;
	}
}
