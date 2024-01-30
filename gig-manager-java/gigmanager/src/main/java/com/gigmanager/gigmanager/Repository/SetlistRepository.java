package com.gigmanager.gigmanager.Repository;

import com.gigmanager.gigmanager.model.Setlist;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface SetlistRepository extends Repository<Setlist, Long> {
    Setlist save(Setlist setlist);
    Optional<Setlist> findById(Long id);
}
