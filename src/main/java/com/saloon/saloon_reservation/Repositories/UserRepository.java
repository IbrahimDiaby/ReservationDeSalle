package com.saloon.saloon_reservation.Repositories;

import com.saloon.saloon_reservation.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
