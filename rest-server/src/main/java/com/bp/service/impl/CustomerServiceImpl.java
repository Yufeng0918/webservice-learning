package com.bp.service.impl;

import com.bp.model.Customer;
import com.bp.model.Order;
import com.bp.service.CustomerService;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;


public class CustomerServiceImpl implements CustomerService {

	private long currentId = 123;
	private Map<Long, Customer> customers = new HashMap<Long, Customer>();
	private Map<Long, Order> orders = new HashMap<Long, Order>();

	public CustomerServiceImpl() {

		System.out.println("init customer service");

		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("customer1");
		customers.put(customer.getId(), customer);

		Order order = new Order();
		order.setId(5);
		order.setDescription("order5");
		orders.put(order.getId(), order);
		System.out.println(order.getProduct(1).toString());
	}

	public Customer getCustomerById(long customerId) {

		System.out.println("invoke customer");
		Customer customer = customers.get(customerId);
		return customer;
	}

	public Order getOrderById(long orderId) {
		System.out.println("invoke order");
		Order order = orders.get(orderId);
		System.out.println(order.getProducts().size());
		return order;
	}

	public Response updateCustomer(Customer customer) {

		Customer c = this.customers.get(customer.getId());
		Response r = null;
		if (null != c) {
			this.customers.put(customer.getId(), customer);
			r = Response.ok().build();
		} else {
			r = Response.notModified().build();
		}
		return r;
	}

	public Response addCustomer(Customer customer) {

		customer.setId(++this.currentId);
		this.customers.put(customer.getId(), customer);
		return Response.ok(customer).build();
	}

	public Response deleteCustomer(String id) {
		
		long idNumber = Long.parseLong(id);
		Customer c = customers.get(idNumber);
		Response r = null;

		if (null != c) {
			r = Response.ok().build();
			this.customers.remove(idNumber);
		} else {
			r = Response.notModified().build();
		}
		return r;
	}
}
