package com.example.demo.service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("qfCustomerService")
public class CustomerServiceImpl {

    @Autowired
    protected CustomerDao customerDao;

    private static final int PASSWORD_LENGTH = 16;

    public Customer saveCustomer(Customer customer) {
        return saveCustomer(customer, customer.isRegistered());
    }

    public Customer saveCustomer(Customer customer, boolean register) {

        if(register && !customer.isRegistered()) {
            customer.setRegistered(true);
        }

        //return customerDao.save(customer);
        return null;
    }
}
