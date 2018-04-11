package com.nwidart.repository;

import com.nwidart.model.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("customer.memory")
public class MemoryCustomerRepositoryImpl implements CustomerRepository {

  @Override
  public List<Customer> findAll() {
    List<Customer> customers = new ArrayList<>();

    Customer customer = new Customer();

    customer.setFirstname("Jane");
    customer.setLastname("Doe");

    customers.add(customer);

    return customers;
  }
}
