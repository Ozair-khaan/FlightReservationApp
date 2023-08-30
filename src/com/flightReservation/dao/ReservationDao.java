package com.flightReservation.dao;

import com.flightReservation.model.Reservation;

public interface ReservationDao {
	Reservation bookFlight(Reservation reservation);

	Reservation checkIn(long reservationId, int noOfBags);
}
