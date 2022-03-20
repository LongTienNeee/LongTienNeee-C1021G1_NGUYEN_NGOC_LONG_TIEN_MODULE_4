package com.longtien.service;

import com.longtien.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();
    Optional<Customer> findById(Long id);
    void save(Customer customer);
    void delete(Customer customer);
}
