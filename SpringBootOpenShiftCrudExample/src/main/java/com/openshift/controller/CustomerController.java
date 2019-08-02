/**
 * 
 */
package com.openshift.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openshift.entity.Customer;
import com.openshift.service.CustomerService;

/**
 * @author avadheshkumar
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping
	public ResponseEntity<?> getCustomers() {
		return customerService.getCustomer();
	}

	@PostMapping(value = "/createCustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createCustomers(@Valid @RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
}
