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
public class OneToManyApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer1=new Customer("Naresh");
		Customer customer2=new Customer("vivek");
		
		Item item1=new Item("laptop");
		Item item2=new Item("computer");
		Item item3=new Item("mobile");

		Item item4=new Item("TV");
		Item item5=new Item("smartTv");



		customer1.getItem().add(item1);
		customer1.getItem().add(item2);
		customer1.getItem().add(item3);

		customer2.getItem().add(item4);
		customer2.getItem().add(item5);

		customerRepository.save(customer1);
		customerRepository.save(customer2);
		
	}

}
