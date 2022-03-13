package com.longtien.repository;

import com.longtien.exception.DuplicateEmailException;
import com.longtien.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class CustomerRepository implements ICustomerRepository{
    @Autowired
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer as c", Customer.class);
        return query.getResultList();
    }

    @Override
    public void save(Customer customer) {
        em.persist(customer);
    }
}
