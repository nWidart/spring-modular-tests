package com.nwidart.controllers;

import com.nwidart.dto.Greeting;
import com.nwidart.service.CustomerService;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private final AtomicLong counter = new AtomicLong();
  private CustomerService customerService;

  @Autowired
  public GreetingController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(
        counter.incrementAndGet(),
        customerService.findAll().get(0).getFirstname()
    );
  }
}
