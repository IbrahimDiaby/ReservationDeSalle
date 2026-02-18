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
@Table(name = "saloon")
public class Saloon {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    @Description("Etage")
    private String level;

    @Column(nullable = false)
    private Integer size = 1;

    @Column(nullable = false)
    private Boolean available = true;

    @Column
    private LocalDate createdAt;

    @Column
    private LocalDate updatedAt;
}