package com.longtien.service.customer;

import com.longtien.model.Customer;

public interface ICustomerService {
    Iterable<Customer> findAll();

    void save(Customer customer);
}
