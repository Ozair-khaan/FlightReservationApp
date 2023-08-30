package com.flightReservation.tests;

import com.flightReservation.dao.ReservationDao;
import com.flightReservation.dao.ReservationDaoImpl;
import com.flightReservation.model.Passenger;
import com.flightReservation.model.Reservation;

public class Test {
	public static void main(String[] args) {
		ReservationDao dao = new ReservationDaoImpl();
		Passenger passenger = new Passenger();
		Reservation reservation = new Reservation();
		passenger.setId(123l);
		passenger.setFirstName("John");
		passenger.setLastName("Wick");
		passenger.setEmail("johnwick@gmail.com");
		passenger.setPhone("+1 29122109000");
		reservation.setFlightId(1l);
		reservation.setPassenger(passenger);

		Reservation savedReservation = dao.bookFlight(reservation);
		System.out.println(savedReservation);

		Reservation checkInReservation = dao.checkIn(savedReservation.getId(), 2);
		System.out.println(checkInReservation);

	}
}
