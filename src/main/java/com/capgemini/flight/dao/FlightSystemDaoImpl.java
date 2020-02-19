package com.capgemini.flight.dao;

import java.time.LocalDate;

import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.flight.entity.Airport;
import com.capgemini.flight.entity.Schedule;
import com.capgemini.flight.entity.ScheduledFlight;
import com.capgemini.flight.exception.AirportNotFoundException;
import com.capgemini.flight.exception.ScheduleNotFoundException;
import com.capgemini.flight.util.FlightRepository;

/******************************************************************************************
 * 
 * @author Dipesh kushwaha
 * @Description:To get Schedule and Seat-availability
 ******************************************************************************************
 */
public class FlightSystemDaoImpl implements FlightSystemDao {

	List<ScheduledFlight> schedFlight = FlightRepository.getScheduledFlight();
	List<Schedule> schedulelst = FlightRepository.getSchedule();
	List<Airport> airportlst = FlightRepository.getAirport();
	Airport airport;

	/***
	 * @ method : getsrcAirport by using stream filtering the airport if airport nor
	 * match then throw airportnotFoundException
	 * 
	 * @return :srcAirport
	 * 
	 *****/
	public Airport getsrcAirport(String srcloc) throws AirportNotFoundException {
		List<Airport> lst = airportlst.stream().filter(airport -> airport.getAirportLocation().contentEquals(srcloc))
				.collect(Collectors.toList());
		if (lst.isEmpty())
			throw new AirportNotFoundException("airport not found");
		Airport srcAirport = lst.get(0);
		return srcAirport;
	}

	/***
	 * @ method :getdestAirport by using stream filtering the airport if airport nor
	 * match then throw airportnotFoundException
	 * 
	 * @return :destAirport
	 *
	 *****/
	public Airport getdestAirport(String destloc) throws AirportNotFoundException {
		List<Airport> lst = airportlst.stream().filter(airport -> airport.getAirportLocation().contentEquals(destloc))
				.collect(Collectors.toList());
		if (lst.isEmpty())
			throw new AirportNotFoundException("airport not found");

		Airport destAirport = lst.get(0);
		return destAirport;
	}

	/**
	 * @method: getSchedule to get scheduledFlight and Throws
	 * 
	 * @return type:list
	 * @param srcAirport
	 *            ,destAirport,date
	 * 
	 */
	public List<ScheduledFlight> getSchedule(Airport srcAirport, Airport destAirport, LocalDate date)
			throws AirportNotFoundException, ScheduleNotFoundException {

		List<ScheduledFlight> schedule = schedFlight.stream()
				.filter(e -> e.getSchedule().getSourceAirport().equals(srcAirport)
						&& e.getSchedule().getDestinationAirport().equals(destAirport)
						&& e.getSchedule().getArrivalTime().equals(date))
				.collect(Collectors.toList());

		if (schedule.isEmpty())
			throw new ScheduleNotFoundException("Schedule not found");

		return schedule;

	}

}