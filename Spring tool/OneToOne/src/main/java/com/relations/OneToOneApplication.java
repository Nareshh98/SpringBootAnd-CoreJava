package com.relations;

import com.relations.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.relations.Entity.Customer;
import com.relations.Entity.Item;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer=new Customer("Naresh");
		
		Item item=new Item("laptop");
		customer.setItem(item);
		customerRepository.save(customer);
		
	}

}
