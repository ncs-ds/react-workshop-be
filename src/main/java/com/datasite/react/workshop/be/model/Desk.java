package com.datasite.react.workshop.be.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "desks")
public class Desk {

    @Id
    private String id;

    private int x;
    private int y;
    private Set<Chair> chairs;

    public Desk() {
    }

    public Desk(int x, int y, Set<Chair> chairs) {
        this.x = x;
        this.y = y;
        this.chairs = chairs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Set<Chair> getChairs() {
        return chairs;
    }

    public void setChairs(Set<Chair> chairs) {
        this.chairs = chairs;
    }
}
