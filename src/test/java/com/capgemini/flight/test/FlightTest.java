package com.capgemini.flight.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.flight.dao.FlightSystemDao;
import com.capgemini.flight.dao.FlightSystemDaoImpl;
import com.capgemini.flight.exception.AirportNotFoundException;
import com.capgemini.flight.exception.ScheduleNotFoundException;
import com.capgemini.flight.exception.ValidateException;
import com.capgemini.flight.service.FlightSystemService;
import com.capgemini.flight.service.FlightSystemServiceImpl;

public class FlightTest {
	FlightSystemDao dao = new FlightSystemDaoImpl();
	FlightSystemService ser = new FlightSystemServiceImpl();

	@Test
	@DisplayName("test case1")
	public void testAirportName1() throws AirportNotFoundException {
		assertThrows(AirportNotFoundException.class, () -> {
			dao.getsrcAirport("Jaipur");

		});
	}

	@Test
	@DisplayName("test case2")
	public void testAirportName2() throws AirportNotFoundException {
		assertThrows(AirportNotFoundException.class, () -> {
			dao.getdestAirport(" Agra");

		});
	}

	@Test
	@DisplayName(" test case3")
	public void getSchedule1() throws ValidateException {
		assertThrows(ValidateException.class, () -> {
			ser.getSchedule1("Bhoapl", "Chennai", LocalDate.of(2019, 01, 14));

		});
	}

	@Test
	@DisplayName(" test case 4")
	public void getSchedule2() throws ScheduleNotFoundException {
		assertThrows(ScheduleNotFoundException.class, () -> {
			ser.getSchedule1("Bhopal", "Chennai", LocalDate.of(2020, 04, 23));
		});
	}

	@Test
	@DisplayName(" test case 5")
	public void getSchedule3() throws ScheduleNotFoundException {
		assertThrows(ScheduleNotFoundException.class, () -> {
			ser.getSchedule1("Bhopal", "Bengaluru", LocalDate.of(2020, 03, 15));
		});
	}
}
