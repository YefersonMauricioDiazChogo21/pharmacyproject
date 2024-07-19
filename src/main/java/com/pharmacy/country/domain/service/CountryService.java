package com.pharmacy.country.domain.service;

import java.util.List;
import java.util.Optional;
import com.pharmacy.country.domain.entity.Country;

public interface CountryService {

    void createCountry (Country  country);
    void updateCountry (Country country);
    Country deleteCountry(String id);
    Optional<Country> findCountryById(String id);
    List<Country> findAllCountries();
    
}
