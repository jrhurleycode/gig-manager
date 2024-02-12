package com.gigmanager.gigmanager.Repository;

import com.gigmanager.gigmanager.model.Gigs;
import org.springframework.data.repository.Repository;

public interface GigRepository<T, ID> extends Repository<Gigs, Long> {
    Gigs save(Gigs gigs);
    Gigs findById(Long primaryKey);
    Iterable<T> findAll();
    long count();
    void delete(T entity);
    boolean existsById(ID primaryKey);
}
