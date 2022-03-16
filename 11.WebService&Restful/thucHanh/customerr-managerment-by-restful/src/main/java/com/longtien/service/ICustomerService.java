package com.longtien.service;

import com.longtien.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    void remove(Long id);
}
