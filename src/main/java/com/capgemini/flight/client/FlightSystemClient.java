package com.capgemini.flight.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.capgemini.flight.exception.AirportNotFoundException;
import com.capgemini.flight.exception.ScheduleNotFoundException;
import com.capgemini.flight.exception.ValidateException;
import com.capgemini.flight.service.FlightSystemService;
import com.capgemini.flight.service.FlightSystemServiceImpl;

/********************************************************************
 * 
 * @author Dipesh kushwaha Description: FlightSystem class contains main method
 *         to Scan the Source Location , Destination location ,Date of travel
 *         method: main(String[]args)
 * 
 *******************************************************************
 */
public class FlightSystemClient {
	/************************************
	 * main method to Scan the Source Location , Destination location ,Date of
	 * travel do-while loop condition ask the user to continue in try catch
	 * validating the user input data
	 * 
	 * @param args
	 * @throws ScheduleNotFoundException
	 * @throws AirportNotFoundException
	 * @throws ValidateException
	 */
	public static void main(String[] args)
			throws ScheduleNotFoundException, AirportNotFoundException, ValidateException {
		FlightSystemService ser = new FlightSystemServiceImpl();
		System.out.println(" --------------------FlightManagement System--------------------");
		Scanner scan = new Scanner(System.in);
		String opt = null;
		do {
			try {
				System.out.println("Enter the source location");
				String src = scan.next();
				System.out.println("Enter the destination location");
				String dest = scan.next();
				System.out.println("Enter travel Date in yyyy-MM-dd format:");
				String str = scan.next();
				LocalDate ltd = LocalDate.parse(str);
				DateTimeFormatter df = DateTimeFormatter.ofPattern("y-M-d");
				df.format(ltd);
				System.out.println("------------- FlightSchedule And Seatavailability----------");
				System.out.println(ser.getSchedule1(src, dest, ltd));
			} catch (AirportNotFoundException | ScheduleNotFoundException | ValidateException
					| DateTimeParseException e) {
				System.out.println(e.getMessage());
			}

			System.out.println("press y to continue");
			opt = scan.next();
		} while (opt.equals("y"));
	}
}