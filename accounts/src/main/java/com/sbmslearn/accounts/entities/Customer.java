package com.sbmslearn.accounts.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
// import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Represents a customer entity in the database.
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    /**
     * Unique identifier for the customer.
     */
    @Id
    private Long customerId;

     /**
     * Customer's full name.
     */
    private String name;

     /**
     * Customer's email address.
     */
    private String email;

    /**
     * Customer's mobile phone number.
     */
     private String mobileNumber;

}


// Important Points in this file
// @Data => Dont use Data annotation please