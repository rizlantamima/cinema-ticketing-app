package dev.rizlantamima.cinema.services;

import dev.rizlantamima.cinema.entities.Cinema;

public interface CinemaService {
    void initCinema(String name);

    Cinema getCinema();
}
