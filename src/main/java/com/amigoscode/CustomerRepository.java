package com.amigoscode;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository Contains Table Name & Variable Type of the ID
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
