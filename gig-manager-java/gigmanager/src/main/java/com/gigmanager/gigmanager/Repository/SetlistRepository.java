package com.gigmanager.gigmanager.Repository;

import com.gigmanager.gigmanager.model.Gig;
import com.gigmanager.gigmanager.model.Setlist;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface SetlistRepository<T, ID> extends Repository<Setlist, Long> {
    <Setlist extends T> Setlist save(Setlist setlist);
    Optional<Setlist> findById(ID primaryKey);
    Iterable<T> findAll();
    long count();
    void delete(T entity);
    boolean existsById(ID primaryKey);
}
