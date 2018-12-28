package com.priyam.learnJava.resource;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.priyam.learnJava.model.Customer;
import com.priyam.learnJava.repository.CustomerRepository;

@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
@Path("/customer")
public class CustomerResource {

  @GET
  @Path("/get")
  public Customer getCustomer() {
    return new Customer("Priyam", 23);
  }

  @POST
  @Path("/add")
  public Customer addCustomer(final Customer customer) {
    CustomerRepository c = new CustomerRepository();
    c.save(customer);
    return customer;
  }
}
