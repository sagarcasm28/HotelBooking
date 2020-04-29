package com.SpringBoot.HotelBooking.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Column(name = "hotel_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hotelId;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "is_available")
	private Boolean isAvailable;
	
	@Column(name = "from_date")
	private Date fromDate;
	
	@Column(name = "to_date")
	private Date toDate;
	
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

	public List<Facility> getFacilityList() {
		return facilityList;
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

	public void setFacilityList(List<Facility> facilityList) {
		this.facilityList = facilityList;
	}

	@Column(name = "facilities")
	@JsonIgnore
	private Long facilites;
	
	@JsonProperty("facilities")
    private transient List<Facility> facilityList;
	
	
	
	
	
}
