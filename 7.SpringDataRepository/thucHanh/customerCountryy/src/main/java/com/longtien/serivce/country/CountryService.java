package com.longtien.serivce.country;

import com.longtien.model.Country;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryService implements  ICountryService{
    @Autowired
    private ICountryService countryService;

    @Override
    public Iterable<Country> findAll() {
        return countryService.findAll();
    }
}
