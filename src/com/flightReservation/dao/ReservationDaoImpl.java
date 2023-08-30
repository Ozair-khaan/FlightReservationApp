package com.flightReservation.dao;

import java.util.HashMap;

import com.flightReservation.model.Flight;
import com.flightReservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {

	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;

	public ReservationDaoImpl() {
		flights = new HashMap<>();
		reservations = new HashMap<>();

		Flight flight1 = new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirline("American");
		flight1.setDepartureCity("New York");
		flight1.setArrivalCity("Los Angles");
		flight1.setDateAndTimeOfDeparture("21/10/2023 11PM");
		flights.put(flight1.getId(), flight1);

		Flight flight2 = new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("456");
		flight2.setOperatingAirline("South West");
		flight2.setDepartureCity("Denver");
		flight2.setArrivalCity("Rio");
		flight2.setDateAndTimeOfDeparture("15/06/2023 9AM");
		flights.put(flight2.getId(), flight2);
	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId = reservationId + 1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);
		return reservation;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {

		Reservation reservation = reservations.get(reservationId);
		reservation.setNoOfBags(noOfBags);
		reservation.setCheckIn(true);

		return reservation;
	}

}
