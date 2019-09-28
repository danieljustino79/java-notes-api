package com.sb2.javanotesapi;

import com.sb2.javanotesapi.models.reponses.PublicationResponse;
import com.sb2.javanotesapi.services.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/publications")
public class PublicationController {
    @Autowired
    PublicationService service;

    @GetMapping
    public List<PublicationResponse> get(){
        List<PublicationResponse> list = service.getAll();
        return list;
    }
}
