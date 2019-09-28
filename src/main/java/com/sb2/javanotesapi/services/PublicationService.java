package com.sb2.javanotesapi.services;

import com.sb2.javanotesapi.models.reponses.PublicationResponse;
import com.sb2.javanotesapi.models.requests.PublicationRequestPost;
import com.sb2.javanotesapi.repositories.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {

    @Autowired
    private PublicationRepository rep;

    public List<PublicationResponse> getAll(){
        return rep.findAll();
    }

    public  PublicationResponse save(PublicationRequestPost publication){
        PublicationResponse entity = publicationRequestPostToPublicationResponse(publication);
        PublicationResponse resp = rep.save(entity);
        return resp;
    }

    private static PublicationResponse publicationRequestPostToPublicationResponse(PublicationRequestPost obj){
        PublicationResponse resp = new PublicationResponse();
        resp.setContent(obj.getContent());
        resp.setDateCreate(obj.getDateCreate());
        return resp;
    }
}
