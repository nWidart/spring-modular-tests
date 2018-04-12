package com.nwidart.repository;

import com.nwidart.model.Customer;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {

  List<Customer> findAll();

  @Override
  <S extends Customer> S save(S entity);
}