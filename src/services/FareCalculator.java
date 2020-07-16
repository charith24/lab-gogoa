package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	
	
	
	public double book(Hotel hotel) {
		
		double total_fare=0;
		total_fare=hotel.getNoOfPersons()*hotel.getRates();
		return total_fare;
	}
	public double book(Flight flight) {
		
		double total_fare=0;
		total_fare=flight.getNoOfPersons()*flight.getRates();
		return total_fare;
		
	}
	public double book(Train train) {
		
		double total_fare=0;
		total_fare=train.getNoOfPersons()*train.getRates();
		return total_fare;
		
	}
	public double book(Bus bus) {
		double total_fare=0;
		total_fare=bus.getNoOfPersons()*bus.getRates();
		return total_fare;
	}
	
	
	
}