package com.gigmanager.gigmanager.Repository;

import com.gigmanager.gigmanager.model.Gig;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface GigRepository<T, ID> extends Repository<Gig, Long> {
    Gig save(Gig gig);
    Optional<Gig> findById(ID primaryKey);
    Iterable<T> findAll();
    long count();
    void delete(T entity);
    boolean existsById(ID primaryKey);
}
