package com.example.demo.domain;

import java.io.Serializable;

public interface Customer extends Serializable {

    Long getId();

    void setId(Long id);

    String getUsername();

    void setUsername(String username);

    String getPassword();

    void setPassword(String password);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    Boolean isRegistered();

    void setRegistered(Boolean registered);
}
