package com.bp.rest;

import java.util.List;

import com.bp.model.Person;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	WebClient webClient;

	@Before
	public void setUp() throws Exception {
		webClient = WebClient.create("http://localhost:8080/rest/cxf");
	}

	@Test
	public void testGetPersonById() {
		int id = 1;
		Person person = webClient.path("/person/profile/" + id)
				.accept("application/xml").type("application/xml")
				.get(Person.class);

		System.out.println(person.toString());
	}

	@Test
	public void testGetPersonList() {
		@SuppressWarnings("unchecked")
		List<Person> list = (List<Person>) webClient.path("/person/list")
				.accept("application/xml").type("application/xml")
				.getCollection(Person.class);

		System.out.println(list.toString());
	}

	@Test
	public void testGetPersonByAge() {
		@SuppressWarnings("unchecked")
		List<Person> list = (List<Person>) webClient.path("/person/list/byAge")
				.accept("application/xml").type("application/xml")
				.replaceQueryParam("minAge", 1).replaceQueryParam("maxAge", 8)
				.getCollection(Person.class);

		System.out.println(list.toString());
	}
}
