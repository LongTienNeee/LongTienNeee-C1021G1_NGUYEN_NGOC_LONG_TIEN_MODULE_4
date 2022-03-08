package com.longtien.repository;

import com.longtien.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
@Repository
@Transactional
public class CustomerRepository implements ICustomerRepository{
@PersistenceContext
private EntityManager entityManager;

    @Override
    public List<Customer> findAll() {
        TypedQuery query = entityManager.createQuery("select c from Customer as c", Customer.class);
        return query.getResultList();
    }

    @Override
    public void save(Customer customer) {
        if(customer != null){
            entityManager.persist(customer);
        } else {
            entityManager.merge(customer);
        }
    }

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        String sql = "CALL Insert_Customer(:firstName, :lastName)";
        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("firstName", customer.getFirstName());
        query.setParameter("lastName", customer.getLastName());
        return query.executeUpdate() == 0;
    }
}
