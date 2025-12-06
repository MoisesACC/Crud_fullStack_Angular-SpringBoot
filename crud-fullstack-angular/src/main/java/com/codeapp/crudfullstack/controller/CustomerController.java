package com.codeapp.crudfullstack.controller;

import com.codeapp.crudfullstack.entity.Customer;
import com.codeapp.crudfullstack.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void  deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        Customer customerDb = customerService.findById(customer.getId());
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setEmail(customer.getEmail());
        return customerService.update(customerDb);
    }


}
