package com.flightReservation.model;

public class Reservation extends AbstractModel {
	private Passenger passenger;
	private Flight flight;
	private long flightId;
	private int noOfBags;
	private boolean checkIn;

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public int getNoOfBags() {
		return noOfBags;
	}

	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	@Override
	public String toString() {
		return "Reservation [passenger=" + passenger + ", flight=" + flight + ", flightId=" + flightId + ", noOfBags="
				+ noOfBags + ", checkIn=" + checkIn + "]";
	}

}
