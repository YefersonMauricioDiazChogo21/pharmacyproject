package com.pharmacy.city.domain.entity;

public class City{
    private int id;
    private String name;
    private int idcity;
    public City() {
    }
    public City(int id, String name, int idcity) {
        this.id = id;
        this.name = name;
        this.idcity = idcity;
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
    public int getIdcity() {
        return idcity;
    }
    public void setIdcity(int idcity) {
        this.idcity = idcity;
    }
    
    
}
