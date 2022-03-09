package com.longtien.repository;

import com.longtien.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}