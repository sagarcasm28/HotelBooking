package com.SpringBoot.HotelBooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facility")
public class Facility {

	@Column(name = "facility_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long facilityId;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "desc")
	private String desc;

	public Long getFacilityId() {
		return facilityId;
	}

	public String getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
