package com.longtien.repository;

import com.longtien.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CustomerRepository implements ICustomerRepository{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = entityManager.createQuery("select c from Customer as c" , Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(long id) {
        TypedQuery<Customer> query = entityManager.createQuery("select c from Customer as c where c.id= :id ",Customer.class);
        query.setParameter("id", id);
        try{
            return query.getSingleResult();
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void remove(long id) {
        entityManager.remove(id);
    }

    @Override
    public void save(Customer customer) {
        if(customer != null){
            entityManager.merge(customer);
        } else {
            entityManager.persist(customer);
        }
    }
}

