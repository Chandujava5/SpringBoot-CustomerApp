package com.abc.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.customer.model.Customer;
import com.abc.customer.repo.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepository repo;
	@PostMapping("/saveCustomer")
	public String save(@RequestBody Customer customer) {
		repo.save(customer);
		return "Data saved in db succussfully";
		
	}
	@GetMapping("/getAllCustomer")
	public List<Customer> findAll(){
		return repo.findAll();
		
		
	}
	
	@DeleteMapping ("/delete/{id}")
	public String deleteById(@PathVariable ("id")Integer id){
		repo.deleteById(id);
		return "delete the record from DB";
		
	}
	@GetMapping("/getCustomer/{id}")
	public Optional<Customer> findById(@PathVariable("id")Integer id){
		return repo.findById(id);
	}
}


