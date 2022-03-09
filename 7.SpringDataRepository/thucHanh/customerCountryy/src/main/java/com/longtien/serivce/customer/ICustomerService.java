package com.longtien.serivce.customer;

import com.longtien.model.Customer;
import com.longtien.repository.ICustomerRepository;

public interface ICustomerService {
    Iterable<Customer> findAll();

    void save(Customer customer);
}
