package service;

import model.Customer;

import java.util.List;

public interface ICustomer {
    List<Customer> getAllCustomer();
    Customer findCustomerById(int id);
    public void add(Customer customer);
    public void delete(int id);
    public void edit(int id, Customer customer);
}
