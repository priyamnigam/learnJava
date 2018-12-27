package com.priyam.learnJava.Rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.priyam.learnJava.Rest.model.Customer;

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
    customer.setName("Priyam nigam");
    return customer;
  }
}
