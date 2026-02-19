package com.saloon.saloon_reservation.Services;

import com.saloon.saloon_reservation.Entities.Session;
import com.saloon.saloon_reservation.Repositories.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SessionService {

    private final SessionRepository sessionRepository;

    public Session create(Session session) {
        return sessionRepository.save(session);
    }

    public List<Session> getAll() {
        return sessionRepository.findAll();
    }

    public Session getById(UUID id) {
        return sessionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Session not found"));
    }

    public void delete(UUID id) {
        sessionRepository.deleteById(id);
    }
}
