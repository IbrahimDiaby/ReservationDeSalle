package com.saloon.saloon_reservation.Repositories;

import com.saloon.saloon_reservation.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReservationRepository extends JpaRepository<Reservation, UUID> {
}
