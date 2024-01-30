package com.gigmanager.gigmanager.Repository;

import com.gigmanager.gigmanager.model.Gig;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface GigRepository extends Repository<Gig, Long> {
    Gig save(Gig gig);
    Optional<Gig> findById(Long id);
}
