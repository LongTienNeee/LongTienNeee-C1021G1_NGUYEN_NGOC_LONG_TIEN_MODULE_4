package com.longtien.service.customer;

import com.longtien.model.Customer;
import com.longtien.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void save(Customer customer){
        customerRepository.save(customer);
    }
}
