package com.saloon.saloon_reservation.Repositories;

import com.saloon.saloon_reservation.Entities.Saloon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaloonRepository extends JpaRepository<Saloon, UUID> {
}
