package com.gigmanager.gigmanager.Controller;

import com.gigmanager.gigmanager.Service.GigService;
import com.gigmanager.gigmanager.model.Gigs;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gig")
public class GigController {
    private final GigService service;

    public GigController(GigService service) {
        this.service = service;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Object getAllGigs (){
        return service.findAllGigs();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Gigs findGigById(@PathVariable Long id){
        return service.findGigById(id);
    }
}
