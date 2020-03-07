package com.edusol.banking.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CustomerDetails {
    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String contact;
    private String city;

}
