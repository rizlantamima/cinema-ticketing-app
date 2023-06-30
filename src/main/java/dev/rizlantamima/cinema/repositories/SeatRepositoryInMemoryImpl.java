package dev.rizlantamima.cinema.repositories;

import dev.rizlantamima.cinema.entities.Seat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeatRepositoryInMemoryImpl implements SeatRepository {

    private List<Seat> data = new ArrayList<>();


    public Seat findById(Integer id) {
        for (Seat seat : data) {
            if (seat.getId().equals(id)) {
                return seat;
            }
        }
        return null;
    }

    public List<Seat> findAll() {
        return data;
    }

    public void create(Seat seat) {
        seat.setId(data.size() + 1);
        data.add(seat);
    }

    public void update(Seat dataSeat) {
        List<Seat> newData = new ArrayList<Seat>();
        for (Seat seat : data) {
            if (dataSeat.getId().equals(seat.getId())) {
                newData.add(dataSeat);
            } else {
                newData.add(seat);
            }
        }
        data = newData;
    }

    public void delete(Seat dataSeat) {
        Iterator<Seat> iterator = this.data.iterator();
        while (iterator.hasNext()) {
            Seat seat = iterator.next();
            if (dataSeat.getId().equals(seat.getId())) {
                iterator.remove();
            }
        }
    }

    public void clear() {
        data = new ArrayList<>();
    }


    public int getTotalFree() {
        int totalFree = 0;
        for (Seat seat : data) {
            if (!seat.isSold()) {
                totalFree = totalFree + 1;
            }
        }
        return totalFree;
    }

    public int getTotalSold() {
        int totalSold = 0;
        for (Seat seat : data) {
            if (seat.isSold()) {
                totalSold = totalSold + 1;
            }
        }
        return totalSold;
    }


    public List<Seat> getSold() {
        List<Seat> dataSold = new ArrayList<Seat>();
        for (Seat seat : data) {
            if (seat.isSold()) {
                dataSold.add(seat);
            }
        }
        return dataSold;
    }
}
