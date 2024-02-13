package com.gigmanager.gigmanager.Controller;

import com.gigmanager.gigmanager.Service.GigService;
import com.gigmanager.gigmanager.model.Gigs;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/gig")
public class GigController {
    private final GigService service;

    public GigController(GigService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Object getAllGigs() {
        return service.findAllGigs();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Optional findGigById(@PathVariable Long id) {
        try {
            return service.findGigById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(method = RequestMethod.POST)
    public Gigs createGig(@RequestBody Gigs gig) {
        return service.createGig(gig);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteGig(@PathVariable Long id) {
        service.deleteGig(id);
    }

}
