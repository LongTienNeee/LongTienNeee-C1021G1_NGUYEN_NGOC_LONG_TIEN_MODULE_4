package com.longtien.repository;

import com.longtien.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customerList;

    static{
        customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Tiên", 19));
        customerList.add(new Customer(2,"Hoàng", 24));
        customerList.add(new Customer(3,"Trọng", 23));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }
}
