package dev.rizlantamima.cinema.services;

import dev.rizlantamima.cinema.entities.Cinema;
import dev.rizlantamima.cinema.repositories.CinemaRepository;

public class CinemaServiceImpl implements CinemaService {
    private CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public void initCinema(String name) {
        this.cinemaRepository.initCinema(name);
    }

    @Override
    public Cinema getCinema() {
        return this.cinemaRepository.getCurrentCinema();
    }
}
