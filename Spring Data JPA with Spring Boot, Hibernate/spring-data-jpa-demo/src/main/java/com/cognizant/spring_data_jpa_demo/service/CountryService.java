package com.cognizant.spring_data_jpa_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring_data_jpa_demo.model.Country;
import com.cognizant.spring_data_jpa_demo.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountry(int id) {
        return countryRepository.findById(id).orElse(null);
    }

    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }
}