/**
 * 
 */
package com.openshift.service.impl;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.openshift.entity.Customer;
import com.openshift.model.RestResponse;
import com.openshift.repository.CustomerRepository;
import com.openshift.service.CustomerService;

/**
 * @author avadheshkumar
 *
 */
@Service
@Qualifier("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public ResponseEntity<?> getCustomer() {
		return new ResponseEntity<>(new RestResponse("success", HttpStatus.OK.value(), customerRepository.findAll()), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> createCustomer(Customer customer) {
		Customer cust = customerRepository.save(customer);
		return new ResponseEntity<>(new RestResponse("success", HttpStatus.OK.value(), Collections.singletonList(cust)), HttpStatus.OK);
	}

}
