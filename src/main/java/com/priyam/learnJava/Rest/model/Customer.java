package com.priyam.learnJava.Rest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
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
}
