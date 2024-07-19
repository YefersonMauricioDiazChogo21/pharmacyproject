package com.pharmacy.customer.domain.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.customer.domain.entity.Person;

public interface PersonService {
    void createPerson (Person  person);
    void updatePerson (Person person);
    Person deletePerson (String id);
    Optional<Person> findPersonById(String id);
    List<Person> findAllPersons();
}
