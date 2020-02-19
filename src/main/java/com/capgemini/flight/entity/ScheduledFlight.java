package com.capgemini.flight.entity;
/******************************************************************************************
 * 
 * @author Dipesh kushwaha
 * Description:constructor,getters
 * @method:toString
 *****************************************************************************************
 */
public class ScheduledFlight {
	private Flight flight;
	private Integer availableSeats;
	private Schedule schedule;

	public ScheduledFlight(Flight flight, Integer availableSeats, Schedule schedule) {
		super();
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public Flight getFlight() {
		return flight;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	@Override
	public String toString() {
		
		return flight+"\navailableSeats: "+availableSeats+"\nschedule: "+schedule;
	}
 
	
}