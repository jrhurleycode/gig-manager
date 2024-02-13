package com.gigmanager.gigmanager.Repository;

import com.gigmanager.gigmanager.model.Gigs;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GigRepository<T, ID> extends CrudRepository<Gigs, Long> {
    Gigs save(Gigs gig);

    Optional<Gigs> findById(Long primaryKey);

    Iterable<Gigs> findAll();

    long count();

    void deleteById(Long id);
}
