package com.nwidart.repository;

import com.nwidart.model.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("customer.hibernate")
@Primary
public class HibernateCustomerRepositoryImpl {

  public List<Customer> findAll() {
    List<Customer> customers = new ArrayList<>();

    Customer customer = new Customer();

    customer.setFirstname("John");
    customer.setLastname("Doe");

    customers.add(customer);

    return customers;
  }
}
