package com.capgemini.flight.entity;

import java.math.BigInteger;
/**
 * 
 * @author Dipesh kushwaha
 *@method : toString
 */
public class Flight {
	private BigInteger flightNumber;
	private String flightname;
	private Integer seatCapacity;

	public Flight(BigInteger flightNumber,String flightname, Integer seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightname = flightname;
		this.seatCapacity = seatCapacity;
	}

	public BigInteger getFlightNumber() {
		return flightNumber;
	}

	public String getFlightname() {
		return flightname;
	}
	public Integer getSeatCapacity() {
		return seatCapacity;
	}

	@Override
	public String toString() {
		
		return " flightNumber: "+flightNumber+"\nFlight name: "+flightname+"\nseatCapacity: "+seatCapacity;
	}

	
}
