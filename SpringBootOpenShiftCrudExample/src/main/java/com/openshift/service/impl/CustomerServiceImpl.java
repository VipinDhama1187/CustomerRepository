/**
 * 
 */
package com.openshift.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.openshift.entity.Customer;
import com.openshift.model.RestResponse;
import com.openshift.service.CustomerService;

/**
 * @author avadheshkumar
 *
 */
@Service
@Qualifier("customerService")
public class CustomerServiceImpl implements CustomerService {
	/*
	 * @Autowired private CustomerRepository customerRepository;
	 */
	
	private static List<Customer> customerList = new ArrayList<>();
	@Override
	public ResponseEntity<?> getCustomer() {
		return new ResponseEntity<>(new RestResponse("success", HttpStatus.OK.value(), customerList), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> createCustomer(Customer customer) {
		customerList.add(customer);
		return new ResponseEntity<>(new RestResponse("success", HttpStatus.OK.value(), Collections.singletonList(customer)), HttpStatus.OK);
	}

}
