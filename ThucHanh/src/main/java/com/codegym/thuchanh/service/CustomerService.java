package com.codegym.thuchanh.service;

import com.codegym.thuchanh.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    public static List<Customer> customerList = new ArrayList<Customer>();
    static {
        customerList.add(new Customer(1, "Nguyen Khac Nhat", "nhat@codegym.vn", "Hà Nội"));
        customerList.add(new Customer(2, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Đà Nẵng"));
        customerList.add(new Customer(3, "Le Thi Chau", "chau.le@codegym.vn", "Hà Nội"));
        customerList.add(new Customer(4, "Nguyen Thuy Duong", "duong.nguyen@codegym.vn", "Sài Gòn"));
        customerList.add(new Customer(5, "CodeGym", "codegym@codegym.vn", "Việt Nam"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
