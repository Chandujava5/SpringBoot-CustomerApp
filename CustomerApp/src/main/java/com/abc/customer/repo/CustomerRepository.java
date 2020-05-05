package com.abc.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
