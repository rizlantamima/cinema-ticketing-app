package dev.rizlantamima.cinema.services;

import dev.rizlantamima.cinema.entities.Seat;

import java.util.List;

public interface SeatService {

    List<Seat> getAllSeats();

    List<Seat> getSoldSeats();

    void init(Integer column, Integer row);
    int getTotalFreeSeats();

    int getTotalSoldSeats();

    boolean bookSeat(String seatLabel);

    boolean cancelSeat(String seatCode);

    void clear();
}
