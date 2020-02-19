package com.capgemini.flight.util;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.flight.entity.Airport;
import com.capgemini.flight.entity.Flight;
import com.capgemini.flight.entity.Schedule;
import com.capgemini.flight.entity.ScheduledFlight;

/******************************************************************************************
 * 
 * @author Dipesh kushwaha
 * 
 *****************************************************************************************
 */
public class FlightRepository {

	public static List<ScheduledFlight> scheduledlst = new ArrayList<ScheduledFlight>();
	public static List<Airport> airportlst = new ArrayList<Airport>();
	public static List<Schedule> schedulelst = new ArrayList<Schedule>();

	static {

		Flight flight1 = new Flight(BigInteger.valueOf(1001), "Air India", 310);
		Flight flight2 = new Flight(BigInteger.valueOf(1002), "Spice jet", 250);
		Flight flight3 = new Flight(BigInteger.valueOf(1003), "IndiGo", 200);
		Flight flight4 = new Flight(BigInteger.valueOf(1004), "vistra", 310);
		Flight flight5 = new Flight(BigInteger.valueOf(1005), "Air India", 230);
		Flight flight6 = new Flight(BigInteger.valueOf(1005), "IndiGo", 230);

		Airport airport1 = new Airport("Chandigarh Airport", "Chandigarh", "IXC");
		Airport airport2 = new Airport("Bengaluru International Airport", "Bengaluru", "BLR");
		Airport airport3 = new Airport("Bhopal Airport", "Bhopal", "BHO");
		Airport airport4 = new Airport("chennai International Airport", "Chennai", "MAA");
		Airport airport5 = new Airport("indira Gandhi International Airport", "NewDelhi", "DEL");
		Airport airport6 = new Airport("Patna Airport", "Patna", "PAT");
		airportlst.add(airport1);
		airportlst.add(airport2);
		airportlst.add(airport3);
		airportlst.add(airport4);
		airportlst.add(airport5);
		airportlst.add(airport6);

		Schedule schedule1 = new Schedule(airport1, airport2, LocalDate.of(2020, 03, 10), LocalDate.of(2020, 03, 10));
		Schedule schedule2 = new Schedule(airport2, airport5, LocalDate.of(2020, 02, 20), LocalDate.of(2020, 02, 20));
		Schedule schedule3 = new Schedule(airport5, airport2, LocalDate.of(2020, 02, 19), LocalDate.of(2020, 02, 19));
		Schedule schedule4 = new Schedule(airport5, airport6, LocalDate.of(2020, 02, 23), LocalDate.of(2020, 02, 23));
		Schedule schedule5 = new Schedule(airport3, airport4, LocalDate.of(2020, 02, 24), LocalDate.of(2020, 02, 24));
		Schedule schedule6 = new Schedule(airport4, airport5, LocalDate.of(2020, 02, 23), LocalDate.of(2020, 02, 23));
		schedulelst.add(schedule1);
		schedulelst.add(schedule2);
		schedulelst.add(schedule3);
		schedulelst.add(schedule4);
		schedulelst.add(schedule5);
		schedulelst.add(schedule6);

		ScheduledFlight sflight1 = new ScheduledFlight(flight1, 50, schedule1);
		ScheduledFlight sflight2 = new ScheduledFlight(flight2, 26, schedule2);
		ScheduledFlight sflight3 = new ScheduledFlight(flight3, 39, schedule4);
		ScheduledFlight sflight4 = new ScheduledFlight(flight4, 50, schedule6);
		ScheduledFlight sflight5 = new ScheduledFlight(flight5, 50, schedule5);
		ScheduledFlight sflight6 = new ScheduledFlight(flight6, 50, schedule3);

		scheduledlst.add(sflight1);
		scheduledlst.add(sflight2);
		scheduledlst.add(sflight3);
		scheduledlst.add(sflight4);
		scheduledlst.add(sflight5);
		scheduledlst.add(sflight6);

	}

	/*
	 * method:getScheduledflight This method return Scheduledlst
	 */
	public static List<ScheduledFlight> getScheduledFlight() {
		return scheduledlst;
	}

	/*
	 * method:getAirport This method return airportlst
	 */
	public static List<Airport> getAirport() {
		return airportlst;
	}

	/*
	 * method:getSchedule This method return schedulelst
	 */
	public static List<Schedule> getSchedule() {
		return schedulelst;
	}
}
