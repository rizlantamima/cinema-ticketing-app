package dev.rizlantamima.cinema.services;

import dev.rizlantamima.cinema.entities.Seat;
import dev.rizlantamima.cinema.repositories.SeatRepository;

import java.util.List;

public class SeatServiceImpl implements SeatService{
    private SeatRepository seatRepository;

    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<Seat> getAllSeats() {
        return null;
    }

    @Override
    public List<Seat> getSoldSeats() {
        return null;
    }

    @Override
    public void initSeat(Integer column, Integer row) {

    }

    @Override
    public int getTotalFreeSeats() {
        return 0;
    }

    @Override
    public int getTotalSoldSeats() {
        return 0;
    }

    @Override
    public boolean bookSeat(String seatLabel) {
        return false;
    }

    @Override
    public boolean cancelSeat(String seatCode) {
        return false;
    }

    @Override
    public void clear() {

    }
}
