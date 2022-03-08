package com.longtien.repository;

import com.longtien.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void save(Customer customer);

    boolean insertWithStoredProcedure(Customer customer);
}
