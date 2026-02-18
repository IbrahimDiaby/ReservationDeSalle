package com.saloon.saloon_reservation.Services;

import com.saloon.saloon_reservation.Entities.Reservation;
import com.saloon.saloon_reservation.Entities.Saloon;
import com.saloon.saloon_reservation.Entities.User;
import com.saloon.saloon_reservation.Repositories.ReservationRepository;
import com.saloon.saloon_reservation.Repositories.SaloonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public Reservation create(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    public Reservation getById(UUID id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));
    }

    public void delete(UUID id) {
        reservationRepository.deleteById(id);
    }
}
