package com.example.demo.service;

import com.example.demo.domain.Customer;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    Customer registerCustomer(Customer customer, String username, String password);

    Customer readCustomerByUsername(String customerName);

    Customer createNewCustomer();
}
