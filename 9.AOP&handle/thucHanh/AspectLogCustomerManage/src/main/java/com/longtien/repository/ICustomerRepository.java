package com.longtien.repository;

import com.longtien.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository {
    List<Customer> findAll();
}
