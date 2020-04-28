package com.SpringBoot.HotelBooking.dtos;

public class Booking {

	private Long bookingId;

	private String status;

	private String modeOfPayments;

	private String isRefundAvailable;

	private String fromDate;

	private String toDate;

	private String pricePerRoom;

	public Long getBookingId() {
		return bookingId;
	}

	public String getStatus() {
		return status;
	}

	public String getModeOfPayments() {
		return modeOfPayments;
	}

	public String getIsRefundAvailable() {
		return isRefundAvailable;
	}

	public String getFromDate() {
		return fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public String getPricePerRoom() {
		return pricePerRoom;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setModeOfPayments(String modeOfPayments) {
		this.modeOfPayments = modeOfPayments;
	}

	public void setIsRefundAvailable(String isRefundAvailable) {
		this.isRefundAvailable = isRefundAvailable;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public void setPricePerRoom(String pricePerRoom) {
		this.pricePerRoom = pricePerRoom;
	}
}
