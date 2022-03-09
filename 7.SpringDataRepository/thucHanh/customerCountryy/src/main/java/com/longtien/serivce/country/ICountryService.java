package com.longtien.serivce.country;

import com.longtien.model.Country;

public interface ICountryService {
    Iterable<Country> findAll();
}
