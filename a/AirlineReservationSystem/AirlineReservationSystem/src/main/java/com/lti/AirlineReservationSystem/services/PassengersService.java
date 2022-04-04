package com.lti.AirlineReservationSystem.services;

import java.util.List;

import com.lti.AirlineReservationSystem.beans.Passengers;

public interface PassengersService {

	public int addPassengers(Passengers p);
	
	public  List<Passengers> listAllPassengers();
	
	public Passengers findPassengerById(int passId);
	

}
