package com.saloon.saloon_reservation.Services;

import com.saloon.saloon_reservation.Entities.Saloon;
import com.saloon.saloon_reservation.Entities.User;
import com.saloon.saloon_reservation.Repositories.SaloonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SaloonService {

    private final SaloonRepository saloonRepository;

    public List<Saloon> getAll() {
        return saloonRepository.findAll();
    }

    public Saloon getById(UUID id) {
        return saloonRepository.findById(id).orElseThrow(() -> new RuntimeException("Saloon not found"));
    }

    public Saloon create(Saloon saloon) {
        return saloonRepository.save(saloon);
    }

    public void delete(UUID id) {
        saloonRepository.deleteById(id);
    }
}
