package com.example.demo.dao;

import com.example.demo.domain.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public interface CustomerDao {

    void sayHello();

    Customer save(Customer c);
}
