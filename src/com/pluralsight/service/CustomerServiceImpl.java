package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;


public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("inside args constructor");
		this.customerRepository = customerRepository;
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("inside setter");
		this.customerRepository = customerRepository;
	}	
		
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
