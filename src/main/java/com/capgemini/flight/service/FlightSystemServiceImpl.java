package com.capgemini.flight.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.flight.dao.FlightSystemDao;
import com.capgemini.flight.dao.FlightSystemDaoImpl;
import com.capgemini.flight.entity.Airport;
import com.capgemini.flight.entity.ScheduledFlight;
import com.capgemini.flight.exception.AirportNotFoundException;
import com.capgemini.flight.exception.ScheduleNotFoundException;
import com.capgemini.flight.exception.ValidateException;
/******************************************************************************************
 * 
 * @author Dipesh kushwaha
 *****************************************************************************************
 */
public class FlightSystemServiceImpl implements FlightSystemService {

	private FlightSystemDao dao = new FlightSystemDaoImpl();
/**
 * this method get the source and destination airport from the enter location and validate date is not before the current date
 * method: getSchedule1
 */
	@Override
	public List<ScheduledFlight> getSchedule1(String srcLocation, String destLocation, LocalDate localtd)
			throws AirportNotFoundException, ScheduleNotFoundException, ValidateException {
		if (localtd.isBefore(LocalDate.now())) {
			throw new ValidateException(" Date should be greater then current Date");
		}
		
		else {
			Airport sourceAirport = dao.getsrcAirport(srcLocation);
			Airport destinationAirport = dao.getdestAirport(destLocation);
			return dao.getSchedule(sourceAirport, destinationAirport, localtd);
		}

	}

}
