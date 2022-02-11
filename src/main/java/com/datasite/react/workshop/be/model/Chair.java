package com.datasite.react.workshop.be.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chairs")
public class Chair {

    @Id
    private String id;

    public Chair() {
    }

    public Chair(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
