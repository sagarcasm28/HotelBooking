package com.SpringBoot.HotelBooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;

	@Column(name = "status")
	private String status;

	@Column(name = "mode_of_payments")
	private String modeOfPayments;

	@Column(name = "is_refund_available")
	private String isRefundAvailable;

	@Column(name = "from_date")
	private String fromDate;

	@Column(name = "to_date")
	private String toDate;

	@Column(name = "price_per_room")
	private String pricePerRoom;
}
