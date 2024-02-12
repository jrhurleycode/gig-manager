package com.gigmanager.gigmanager.Controller;

import com.gigmanager.gigmanager.Service.GigService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gig")
public class GigController {
    private final GigService service;

    public GigController(GigService service) {
        this.service = service;
    }

    public Object getAllGigs (){
        return service.findAllGigs();
    }
}
