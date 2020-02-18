package com.capgemini.flight.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.flight.entity.ScheduledFlight;
import com.capgemini.flight.exception.AirportNotFoundException;
import com.capgemini.flight.exception.ScheduleNotFoundException;
import com.capgemini.flight.exception.ValidateException;
/******************************************************************************************
 * 
 * @author Dipesh Kushwaha
 *****************************************************************************************
 */
public interface FlightSystemService {
	
	public  List<ScheduledFlight> getSchedule1(String srcLocation,String destLocation,LocalDate ltd)throws AirportNotFoundException,ScheduleNotFoundException,ValidateException;



}
