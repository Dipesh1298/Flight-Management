package com.capgemini.flight.dao;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.flight.entity.Airport;
import com.capgemini.flight.entity.ScheduledFlight;
import com.capgemini.flight.exception.AirportNotFoundException;
import com.capgemini.flight.exception.ScheduleNotFoundException;

/*****************************************************************************************************
 * 
 * @author Dipesh kushwaha
 * 
 *         ***************************************************************************************************
 */
public interface FlightSystemDao {
	/*****************************************************************************************************
	 * 
	 * @Description:
	 * @methods: getsrcAirport,getdestAirport,getSchedule
	 * @param srcloc.destloc
	 *            date
	 * @return
	 * @throws AirportNotFoundException,ScheduleNotFoundException
	 */
	public Airport getsrcAirport(String srcloc) throws AirportNotFoundException;

	public Airport getdestAirport(String destloc) throws AirportNotFoundException;

	public List<ScheduledFlight> getSchedule(Airport srcAirport, Airport destAirport, LocalDate date)
			throws AirportNotFoundException, ScheduleNotFoundException;

}
