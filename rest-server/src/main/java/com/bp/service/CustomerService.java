package com.bp.service;

import com.bp.model.Customer;
import com.bp.model.Order;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path(value = "/customerservice")
@Produces("application/xml")
public interface CustomerService {

	@GET
	@Path("/customer/{customerId}")
	public Customer getCustomerById(@PathParam("customerId") long customerId);

	@GET
	@Path("/order/{orderId}")
	public Order getOrderById(@PathParam("orderId") long orderId);
	
	
	@PUT
	@Path("/customers/")
	public Response updateCustomer(Customer customer);
	
	
	@POST
	@Path("/customers/")
	public Response addCustomer(Customer customer);
	
	
	@DELETE
	@Path("/customers/{id}")
	public Response deleteCustomer(@PathParam("id") String id);
}
