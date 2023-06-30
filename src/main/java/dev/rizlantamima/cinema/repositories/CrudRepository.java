package dev.rizlantamima.cinema.repositories;

import java.util.List;

public interface CrudRepository<T, ID> {
    List<T> findAll();
    void create(T entity);
    T findById(ID id);
    void update(T entity);
    void delete(T entity);
    void clear();
}
