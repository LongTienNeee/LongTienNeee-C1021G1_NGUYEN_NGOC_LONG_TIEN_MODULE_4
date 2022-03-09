package com.longtien.repository;

import com.longtien.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country , Integer> {
}
