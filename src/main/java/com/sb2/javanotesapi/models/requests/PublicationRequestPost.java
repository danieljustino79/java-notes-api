package com.sb2.javanotesapi.models.requests;

public class PublicationRequestPost {
    private String content;
    private String dateCreate;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }
}
