package com.longtien.repository;

import com.longtien.model.Customer;

import java.util.List;

public interface ICustomerRepository{
    List<Customer> findAll();
    Customer findById(long id);
    void remove(long id);
    void save(Customer customer);
}
