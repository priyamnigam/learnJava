package com.priyam.learnJava.repository;

import org.mongodb.morphia.dao.BasicDAO;

import com.priyam.learnJava.model.Customer;

public class CustomerRepository extends BasicDAO<Customer, String> {

  public CustomerRepository() {
    super(MongoConnection.getDatastore());
  }
}
