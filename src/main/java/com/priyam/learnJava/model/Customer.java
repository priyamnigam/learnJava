package com.priyam.learnJava.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Customer {

  @Id
  private String id;
  private String name;
  private int age;

  @JsonCreator
  public Customer(@JsonProperty("name") final String name, @JsonProperty("age") final int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setAge(final int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getId() {
    return id;
  }

}
