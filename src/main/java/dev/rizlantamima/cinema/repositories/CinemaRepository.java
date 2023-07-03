package dev.rizlantamima.cinema.repositories;

import dev.rizlantamima.cinema.entities.Cinema;
import dev.rizlantamima.cinema.entities.Seat;

import java.util.List;

public interface CinemaRepository extends CrudRepository<Cinema, Integer>{
    Cinema initCinema(String name);

    Cinema getCurrentCinema();
}
