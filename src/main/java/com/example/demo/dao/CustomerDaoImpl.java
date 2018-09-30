package com.example.demo.dao;

import com.example.demo.domain.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository("qfCustomerDao")
public class CustomerDaoImpl implements CustomerDao {

    @PersistenceContext(name="qfPU")
    protected EntityManager em;

    public Customer readCustomerById(Long id) {
        return em.find(Customer.class, id);
    }

    public List<Customer> readCustomersByUsername(String username, Boolean cachable) {
        TypedQuery<Customer> query = em.createNamedQuery("QF_READ_CUSTOMER_BY_USER_NAME", Customer.class);
        return null;
    }

    public void sayHello() {
        System.out.println("Say Hello!");
    }


    @Transactional
    public Customer save(Customer c) {
        em.persist(c);
        em.flush();
        return c;
    }

}
