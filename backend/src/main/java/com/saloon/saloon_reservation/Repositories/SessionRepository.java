package com.saloon.saloon_reservation.Repositories;

import com.saloon.saloon_reservation.Entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SessionRepository extends JpaRepository<Session, UUID> {
}
