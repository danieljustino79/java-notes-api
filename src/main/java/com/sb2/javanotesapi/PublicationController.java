package com.sb2.javanotesapi;

import com.sb2.javanotesapi.models.reponses.PublicationResponse;
import com.sb2.javanotesapi.models.requests.PublicationRequestPost;
import com.sb2.javanotesapi.services.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/publications")
public class PublicationController {
    @Autowired
    PublicationService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<PublicationResponse> get(){
        List<PublicationResponse> list = service.getAll();
        return list;
    }

    @PostMapping
    public PublicationResponse post(@RequestBody PublicationRequestPost publication){
        PublicationResponse obj = service.save(publication);
        return obj;
    }

    @GetMapping("/{id}")
    public Optional<PublicationResponse> getById(@PathVariable String id){
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    //https://spring.io/guides/gs/rest-service-cors/
}
