package com.longtien.service;

import com.longtien.model.Customer;

import java.util.List;

public interface ICustomerService{
    List<Customer> findAll();
    Customer findById(long id);
    void remove(long id);
    void save(Customer customer);
}
