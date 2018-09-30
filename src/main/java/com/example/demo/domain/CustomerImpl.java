package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
@NamedQuery(name = "QF_READ_CUSTOMER_BY_USER_NAME", query="SELECT customer FROM CustomerImpl customer\n" +
        "        WHERE customer.username = :username")
public class CustomerImpl implements Customer {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="CUSTOMER_ID")
    @GeneratedValue
    protected Long id;

    @Column(name="CUSTOMER_NAME")
    protected String username;

    @Column(name="PASSWORD")
    protected String password;

    @Column(name="FIRST_NAME")
    protected String firstName;

    @Column(name="LAST_NAME")
    protected String lastName;

    @Column(name="IS_REGISTERED")
    protected Boolean registered = false;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Boolean isRegistered() {
        return registered;
    }

    @Override
    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "The id of the customer is: " + id;
    }

}
