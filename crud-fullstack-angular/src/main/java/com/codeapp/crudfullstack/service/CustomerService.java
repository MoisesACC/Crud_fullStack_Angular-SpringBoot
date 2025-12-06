package com.codeapp.crudfullstack.service;

import com.codeapp.crudfullstack.entity.Customer;


import java.util.List;

public interface CustomerService {
    Customer save (Customer customer);
    List<Customer> findAll();
    Customer findById(Integer id);
    void deleteById(Integer id);
    Customer update(Customer customer);
}
