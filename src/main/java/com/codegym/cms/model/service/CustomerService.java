package com.codegym.cms.model.service;

import com.codegym.cms.model.entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}