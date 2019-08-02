package com.openshift.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openshift.entity.Customer;

@Repository
@Qualifier("customerRepository")
public interface CustomerRepository extends CrudRepository<Customer, Long> {
public List<Customer> findAll();
}
