package com.longtien.service;

import com.longtien.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    boolean insertWithStoredProcedure(Customer customer);
}
