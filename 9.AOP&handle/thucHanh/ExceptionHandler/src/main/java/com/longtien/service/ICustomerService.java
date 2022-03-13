package com.longtien.service;

import com.longtien.exception.DuplicateEmailException;
import com.longtien.model.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();

    void save(Customer customer) throws DuplicateEmailException;
}
