package com.gigmanager.gigmanager.Service;

import com.gigmanager.gigmanager.Repository.GigRepository;
import com.gigmanager.gigmanager.model.Gig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GigService {
    private final GigRepository repository;

    @Autowired
    public GigService (GigRepository repository) {
        this.repository = repository;
    }

public Gig create (Gig gig){
        return repository.save(gig);
}

public Object findAllGigs(){
        return repository.findAll();
}
}
