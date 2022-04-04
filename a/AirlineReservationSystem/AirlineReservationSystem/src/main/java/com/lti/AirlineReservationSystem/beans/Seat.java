package com.lti.AirlineReservationSystem.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SEAT")
public class Seat {

	@Id
	@Column(name="SEAT_NUMBER")
	private String seatNumber;
	
	
	@Column(name="FLIGHT_NUMBER")
	private int flightNumber;
	
	
	@Column(name="SEAT_TYPE")
	private String seatType;
	
	
	@Column(name="SEAT_COST")
	private int seatCost;


	public String getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}


	public int getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getSeatType() {
		return seatType;
	}


	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}


	public int getSeatCost() {
		return seatCost;
	}


	public void setSeatCost(int seatCost) {
		this.seatCost = seatCost;
	}


	public Seat(String seatNumber, int flightNumber, String seatType, int seatCost) {
		super();
		this.seatNumber = seatNumber;
		this.flightNumber = flightNumber;
		this.seatType = seatType;
		this.seatCost = seatCost;
	}


	public Seat() {
		super();
	}


	@Override
	public String toString() {
		return "Seat [seatNumber=" + seatNumber + ", flightNumber=" + flightNumber + ", seatType=" + seatType
				+ ", seatCost=" + seatCost + "]";
	}

	
}



