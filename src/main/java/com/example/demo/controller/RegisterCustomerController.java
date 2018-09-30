package com.example.demo.controller;

import com.example.demo.dao.CustomerDao;
import com.example.demo.domain.Customer;
import com.example.demo.domain.CustomerImpl;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RegisterCustomerController {

    public static final String TEMPLATE = "Hello";

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/customers")
    public String get() {
        customerDao.sayHello();
        return "Getting";
    }

    @RequestMapping("/save")
    public String save() {
        //customerDao.sayHello();
        Customer c = new CustomerImpl();

        customerDao.save(c);
        System.out.println(c);
        return "Saving";
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public ResponseEntity<CustomerImpl> registerCustomer(@RequestBody CustomerImpl customer) {
        customerDao.save(customer);
        return new ResponseEntity<CustomerImpl>(customer, HttpStatus.OK);
    }


    //@Resource(name="qfCustomerService")
    //protected CustomerService customerService;
}
