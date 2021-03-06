package com.devops;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Person {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String firstName;
    private String lastName;
    
   //get first name
    public String getFirstName() {
        return firstName;
    }
   //set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
   //get last name
    public String getLastName() {
        return lastName;
    }
   //set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}