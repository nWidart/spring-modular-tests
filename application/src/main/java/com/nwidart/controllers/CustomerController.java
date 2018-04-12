package com.nwidart.controllers;

import com.nwidart.dto.Greeting;
import com.nwidart.model.Customer;
import com.nwidart.service.CustomerService;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

  private final AtomicLong counter = new AtomicLong();
  private CustomerService customerService;

  @Autowired
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  public Iterable<Customer> greeting() {
    return customerService.findAll();
  }
}
