package com.capgemini.flight.entity;

public class Airport {
	/****
	 * @author Dipesh Kushwaha
	 * Discription: 
	 * Method:
	 * 
	 */
	private String airportName;
	private String airportLocation;
	private String airportCode;

	public Airport(String airportName, String airportLocation, String airportCode) {
		super();
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.airportCode = airportCode;
	}


	public String getAirportName() {
		return airportName;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public String getAirportCode() {
		return airportCode;
	}

	@Override
	public String toString() {
	
		return airportName+" "+airportLocation+" "+airportCode;
	}
   
	
}
