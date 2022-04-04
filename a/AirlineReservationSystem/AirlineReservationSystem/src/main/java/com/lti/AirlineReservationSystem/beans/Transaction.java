package com.lti.AirlineReservationSystem.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tr_seq")
	@SequenceGenerator(name = "tr_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "Tr_Id")
	private int trId;

	@Column(name = "Booking_Date")
	private String bookingDate;

	@Column(name = "total_fair")
	private int tfair;

	@Column(name = " P_Status")
	private String pStatus;

	// @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) //
	// @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	// @JoinColumn(name = "FLIGHT_NUMBER")
	private int flightNumber;

	// @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	// @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	// @JoinColumn(name = "PASS_ID")
	private int passId;

	// @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	// @OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	// @JoinColumn(name = "SEAT_NUMBER")
	private String seatNumber;

	// @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	// @OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	// @JoinColumn(name = "CITY_ID")
	private int cityId;

	public int getTrId() {
		return trId;
	}

	public void setTrId(int trId) {
		this.trId = trId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getTfair() {
		return tfair;
	}

	public void setTfair(int tfair) {
		this.tfair = tfair;
	}

	public String getpStatus() {
		return pStatus;
	}

	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public Transaction(int trId, String bookingDate, int tfair, String pStatus, int flightNumber, int passId,
			String seatNumber, int cityId) {
		super();
		this.trId = trId;
		this.bookingDate = bookingDate;
		this.tfair = tfair;
		this.pStatus = pStatus;
		this.flightNumber = flightNumber;
		this.passId = passId;
		this.seatNumber = seatNumber;
		this.cityId = cityId;
	}

	public Transaction() {
		super();
	}

	@Override
	public String toString() {
		return "Transaction [trId=" + trId + ", bookingDate=" + bookingDate + ", tfair=" + tfair + ", pStatus="
				+ pStatus + ", flightNumber=" + flightNumber + ", passId=" + passId + ", seatNumber=" + seatNumber
				+ ", cityId=" + cityId + "]";
	}

	
	
	

}