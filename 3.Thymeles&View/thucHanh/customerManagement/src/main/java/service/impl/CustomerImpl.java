package service.impl;

import model.Customer;
import service.ICustomer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerImpl implements ICustomer {
  private static final Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1,"Long Tiên", "longtien@gmail.com", "Đà Nẵng"));
        customers.put(2, new Customer(2,"Lê Tùng Tùng", "coDonKhongEm@gmail.com", "HCM"));
        customers.put(3, new Customer(3,"Hùng Bá", "dinhGiaMoiLoaiTien@gmail.com", "Hà Nội"));
        customers.put(4, new Customer(4,"Ngô Bá Hải", "noiNhoMongManh@gmail.com", "Lạng Sơn"));
    }


    @Override
    public List<Customer> getAllCustomer() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findCustomerById(int id) {
        return  customers.get(id);
    }

    @Override
    public void add(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }

    @Override
    public void edit(int id, Customer customer) {
        customers.put(id, customer);

    }


}
