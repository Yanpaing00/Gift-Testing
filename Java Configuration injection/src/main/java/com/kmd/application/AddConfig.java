package com.kmd.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.kmd.repository.CustomerRepository;
import com.kmd.repository.CustomerRepositoryImpl2;
import com.kmd.service.CustomerService;
import com.kmd.service.CustomerServiceImpl;

@Configuration
public class AddConfig {
	@Scope("prototype")
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerService service = new CustomerServiceImpl(new CustomerRepositoryImpl2());
//		CustomerServiceImpl service=new CustomerServiceImpl();
		// service.setCustomerRepo(new CustomerRepositoryImpl2());
		return service;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new CustomerRepositoryImpl2();
	}

}
