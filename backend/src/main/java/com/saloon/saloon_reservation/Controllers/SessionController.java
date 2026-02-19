package com.saloon.saloon_reservation.Controllers;

import com.saloon.saloon_reservation.Entities.Session;
import com.saloon.saloon_reservation.Services.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/sessions")
@RequiredArgsConstructor
public class SessionController {

    private final SessionService sessionService;

    @PostMapping
    public Session createSession(@RequestBody Session session) {
        return sessionService.create(session);
    }

    @GetMapping
    public List<Session> getAllSessions() {
        return sessionService.getAll();
    }

    @GetMapping("/{id}")
    public Session getSessionById(@PathVariable UUID id) {
        return sessionService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        sessionService.delete(id);
    }
}

