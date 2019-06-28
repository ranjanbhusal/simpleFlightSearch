package com.united.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.united.entity.Flight;

@Service
public interface IFlightService {
	
	public List<Flight> getAllFlights();
	public List<Flight> getFlightByFlightNumber(int id);
	public List<Flight> getFlightByFlightNumberAndDate(int flightNumber, Date queryDate);
	public List<Flight> getFLightByAddressAndDeparture(String originOrDestinationAddress, Date departure);

}
