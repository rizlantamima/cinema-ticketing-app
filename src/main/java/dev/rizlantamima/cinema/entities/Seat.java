package dev.rizlantamima.cinema.entities;

import java.time.LocalDateTime;

public class Seat {
    private Integer id;
    private String seatLabel;
    private boolean isSold;

    private LocalDateTime soldTime;

    public Seat(Integer id, String seatLabel, boolean isSold, LocalDateTime soldTime) {
        this.id = id;
        this.seatLabel = seatLabel;
        this.isSold = isSold;
        this.soldTime = soldTime;
    }

    public Seat(String seatLabel) {
        this.seatLabel = seatLabel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeatLabel() {
        return this.seatLabel;
    }

    public void setSeatLabel(String seatLabel) {
        this.seatLabel = seatLabel;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public LocalDateTime getSoldTime() {
        return soldTime;
    }

    public void setSoldTime(LocalDateTime soldTime) {
        this.soldTime = soldTime;
    }
}
