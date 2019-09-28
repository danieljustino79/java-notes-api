package com.sb2.javanotesapi.repositories;

import com.sb2.javanotesapi.models.reponses.PublicationResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublicationRepository extends MongoRepository<PublicationResponse, String> {
}
