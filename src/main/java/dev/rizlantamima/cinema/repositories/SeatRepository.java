package dev.rizlantamima.cinema.repositories;

import dev.rizlantamima.cinema.entities.Seat;

import java.util.List;

public interface SeatRepository extends CrudRepository<Seat, Integer>{
    int getTotalFree();

    int getTotalSold();

    List<Seat> getSold();
}
