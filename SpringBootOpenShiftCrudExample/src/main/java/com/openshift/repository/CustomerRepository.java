package com.openshift.repository;

import java.util.List;

import com.openshift.entity.Customer;

/*@Repository
@Qualifier("customerRepository")*/
public interface CustomerRepository/* extends CrudRepository<Customer, Long> */ {
public List<Customer> findAll();
}
