package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code
public class FareCalculator extends Booking{
	
	public double book(Hotel hotel) {
		
		int total_fare=0;
		total_fare=hotel.getNoOfPersons()*hotel.getRates();
		return total_fare;
	}
	
	
public double book(Flight flight) {
		
		double total_fare=0;
		total_fare=flight.getNoOfPersons()*flight.getRates();
		return total_fare;
		
}
	public double book(Train train) {
		int total_fare=0;
		total_fare=train.getNoOfPersons()*train.getRates();
		return total_fare;
		
	}
	public double book(Bus bus) {
		int total_fare=0;
		total_fare=bus.getNoOfPersons()*bus.getRates();
		return total_fare;
		
	}
}