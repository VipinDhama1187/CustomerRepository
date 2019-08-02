package com.openshift.service;

import org.springframework.http.ResponseEntity;

import com.openshift.entity.Customer;

public interface CustomerService {
	public ResponseEntity<?> getCustomer();

	public ResponseEntity<?> createCustomer(Customer customer);
}
