package dev.rizlantamima.cinema.repositories;

import dev.rizlantamima.cinema.entities.Cinema;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

import java.util.List;
import java.util.Set;

public class CinemaRepositoryImpl implements CinemaRepository {

    private Cinema currentCinema;
    private Validator validator;

    public CinemaRepositoryImpl(Validator validator) {
        this.validator = validator;
    }
    
    public Cinema initCinema(String name){
        Cinema cinema = new Cinema(name);
        Set<ConstraintViolation<Cinema>> violations = validator.validate(cinema);
        currentCinema = cinema;
        if(violations.size() > 0){
            for (ConstraintViolation<Cinema> violation: violations) {
                System.out.println(violation.getMessage());
            }
            currentCinema = null;
        }

        return currentCinema;
    }
    public Cinema getCurrentCinema(){
        return currentCinema;
    }
    public List<Cinema> findAll() {
        return null;
    }

    public void create(Cinema entity) {

    }

    public Cinema findById(Integer integer) {
        return null;
    }

    public void update(Cinema entity) {

    }

    public void delete(Cinema entity) {

    }

    public void clear() {

    }
}
