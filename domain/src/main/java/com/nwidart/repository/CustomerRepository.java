package com.nwidart.repository;

import com.nwidart.model.Customer;
import java.util.List;

public interface CustomerRepository {

  List<Customer> findAll();

}