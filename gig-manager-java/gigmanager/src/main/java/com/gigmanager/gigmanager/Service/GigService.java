package com.gigmanager.gigmanager.Service;

import com.gigmanager.gigmanager.Repository.GigRepository;
import com.gigmanager.gigmanager.model.Gigs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GigService {
    private final GigRepository repository;

    @Autowired
    public GigService(GigRepository repository) {
        this.repository = repository;
    }

    public Gigs create(Gigs gigs) {
        return repository.save(gigs);
    }

    public Object findAllGigs() {
        return repository.findAll();
    }

    public Optional findGigById(Long id) {
        return repository.findById(id);
    }

    public Gigs createGig(Gigs gig) {
        return repository.save(gig);
    }

    public void deleteGig(Long id) {
        repository.deleteById(id);
    }

}
