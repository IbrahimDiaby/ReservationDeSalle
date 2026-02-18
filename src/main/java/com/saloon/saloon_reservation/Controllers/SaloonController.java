package com.saloon.saloon_reservation.Controllers;

import com.saloon.saloon_reservation.Entities.Saloon;
import com.saloon.saloon_reservation.Entities.User;
import com.saloon.saloon_reservation.Services.SaloonService;
import com.saloon.saloon_reservation.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/saloons")
@RequiredArgsConstructor
public class SaloonController {

    private final SaloonService saloonService;

    @PostMapping
    public Saloon createSaloon(@RequestBody Saloon saloon) {
        return saloonService.create(saloon);
    }

    @GetMapping
    public List<Saloon> getAllSaloons() {
        return saloonService.getAll();
    }

    @GetMapping("/{id}")
    public Saloon getSaloonById(@PathVariable UUID id) {
        return saloonService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSaloon(@PathVariable UUID id) {
        saloonService.delete(id);
    }
}

