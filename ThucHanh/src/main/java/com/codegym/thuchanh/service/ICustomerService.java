package com.codegym.thuchanh.service;

import com.codegym.thuchanh.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(int id);
}
