package com.relations;

import com.relations.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.relations.Entity.Customer;
import com.relations.Entity.Item;

import java.util.List;

@SpringBootApplication
public class ManyToOneApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer1=new Customer("Naresh");
		
		
		Item item1=new Item("laptop");
		Item item2=new Item("computer");
		Item item3=new Item("mobile");

		


		customer1.getItem().add(item1);
		customer1.getItem().add(item2);
		customer1.getItem().add(item3);
		
		item1.setCustomer(customer1);  // bydirection
		item2.setCustomer(customer1);
		item3.setCustomer(customer1);

		

		customerRepository.save(customer1);
		
		
	}

}
