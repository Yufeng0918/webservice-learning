package com.bp.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "Order")
public class Order {

	private long id;

	private String description;

	private Map<Long, Product> products = new HashMap<Long, Product>();

	public Order() {

		System.out.println("init order");
		Product prod = new Product();
		prod.setId(1);
		prod.setDescription("iPad Min");
		products.put(prod.getId(), prod);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<Long, Product> getProducts() {
		return products;
	}

	public void setProducts(Map<Long, Product> products) {
		this.products = products;
	}

	@GET
	@Path("products/{productId}")
	public Product getProduct(@PathParam("productId") long productId) {

		System.out.println("invoke prod");
		Product prod = this.products.get(productId);
		return prod;
	}
}
