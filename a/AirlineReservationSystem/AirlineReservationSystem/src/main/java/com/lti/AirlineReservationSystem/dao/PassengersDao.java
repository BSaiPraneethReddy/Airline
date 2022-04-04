package com.lti.AirlineReservationSystem.dao;

import java.util.List;

import com.lti.AirlineReservationSystem.beans.Passengers;

public interface PassengersDao {

	public int addPassengers(Passengers p);
	
	public  List<Passengers> listAllPassengers();
	
	public Passengers findPassengerById(int passId);
	
}
