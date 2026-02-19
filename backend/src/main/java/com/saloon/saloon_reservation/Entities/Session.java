package com.saloon.saloon_reservation.Entities;

import jakarta.persistence.*;
import jdk.jfr.Description;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "sessions")
public class Session {
@Id
@GeneratedValue
private UUID id;

@ManyToOne
@JoinColumn(name = "users_id", nullable = false)
private User user;

@Column(nullable = false)
private String token;

@Column
private LocalDate createdAt;

@Column
private LocalDate updatedAt;
}