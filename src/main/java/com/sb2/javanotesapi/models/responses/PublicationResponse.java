package com.sb2.javanotesapi.models.reponses;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "publication")
public class PublicationResponse {
    @Id
    public String id;
    public String content;
    public String dateCreate;

    public PublicationResponse(){}
//    public PublicationResponse(String content, String date){
//        this.content = content;
//        this.dateCreate = date;
//    }

//    public String getContent() { return content; }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getDateCreate() {
//        return dateCreate;
//    }
//
//    public void setDateCreate(String dateCreate) {
//        this.dateCreate = dateCreate;
//    }
}
