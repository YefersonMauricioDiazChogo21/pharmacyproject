package com.pharmacy.documenttype.domain.entity;

public class DocumentType {
    private int id;
    private String type;
    public DocumentType() {
    }
    public DocumentType(int id, String type) {
        this.id = id;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
