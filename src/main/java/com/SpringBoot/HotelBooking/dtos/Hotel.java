package com.SpringBoot.HotelBooking.dtos;

import java.sql.Date;

public class Hotel {

	private Long hotelId;
	private String country;
	private String street;
	private Boolean isAvailable;
	private Date fromDate;
	private Date toDate;
	private Long facilites;

	public Long getHotelId() {
		return hotelId;
	}

	public String getCountry() {
		return country;
	}

	public String getStreet() {
		return street;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public Long getFacilites() {
		return facilites;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public void setFacilites(Long facilites) {
		this.facilites = facilites;
	}

}
