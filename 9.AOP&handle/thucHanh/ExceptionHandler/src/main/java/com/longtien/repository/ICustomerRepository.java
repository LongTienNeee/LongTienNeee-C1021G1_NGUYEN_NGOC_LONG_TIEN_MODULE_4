package com.longtien.repository;

import com.longtien.exception.DuplicateEmailException;
import com.longtien.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void save(Customer customer) throws DuplicateEmailException;
}
