package com.pharmacy.country.domain.entity;

public class Country {
    private int id;
    private String name;
    public Country() {
    }
    public Country(int id) {
        this.id = id;
    }
    public Country(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
