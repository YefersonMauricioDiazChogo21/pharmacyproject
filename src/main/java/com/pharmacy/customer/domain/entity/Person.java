package com.pharmacy.customer.domain.entity;

public class Person {
    private int id;
    private int iddocumenttype;
    private String name;
    private String lastname;
    private int age;
    private String registration_date;
    private String birthdate;

    public Person() {
    }
    public Person(int id, int iddocumenttype, String name, String lastname, int age, String registration_date,
    String birthdate) {
        this.id = id;
        this.iddocumenttype = iddocumenttype;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.registration_date = registration_date;
        this.birthdate = birthdate;
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
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getIddocumenttype() {
        return iddocumenttype;
    }
    public void setIddocumenttype(int iddocumenttype) {
        this.iddocumenttype = iddocumenttype;
    }
    public String getRegistration_date() {
        return registration_date;
    }
    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    
    
}
