package com.kmd.service;

import java.util.List;

import com.kmd.model.Customer;
import com.kmd.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo;


	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	public CustomerServiceImpl() {
		
	}
	public void setCustomerRepo(CustomerRepository customerRepo) {
		System.out.println("This is constructor injection");
		this.customerRepo = customerRepo;
	}

	public CustomerServiceImpl(CustomerRepository customerRepo) {
		System.out.println("This is setter injection");
		this.customerRepo = customerRepo;
	}

	
		
	
}
