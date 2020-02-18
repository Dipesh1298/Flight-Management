package com.capgemini.flight.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Schedule {
	private Airport sourceAirport ;
	private Airport destinationAirport;
	private LocalDate arrivalTime;
	private LocalDate departureTime;

	public Schedule(Airport sourceAirport, Airport destinationAirport, LocalDate arrivalTime,
			LocalDate departureTime) {
		super();
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public Airport getSourceAirport() {
		return sourceAirport;
	}

	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	@Override
	public String toString() {

		return "\nSourceAirport: " + sourceAirport + "\ndestinationAirport: " + destinationAirport + "\narrivalTime: "
				+ arrivalTime + "\ndepartureTime: " + departureTime;
	}

}
