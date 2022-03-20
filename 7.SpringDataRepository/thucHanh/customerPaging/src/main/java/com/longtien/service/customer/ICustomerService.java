package com.longtien.service.customer;

import com.longtien.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);
    Optional<Customer> findById(Long id);
    void save(Customer customer);
    void delete(Customer customer);
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
