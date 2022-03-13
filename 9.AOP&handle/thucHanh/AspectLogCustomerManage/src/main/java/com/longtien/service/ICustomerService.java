package com.longtien.service;

import com.longtien.model.Customer;

public interface ICustomerService {
    Iterable<Customer> findAll();
}
