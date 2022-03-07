package com.longtien.service;

import com.longtien.model.Customer;
import com.longtien.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
@Autowired
private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void remove(long id) {
        customerRepository.remove(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
