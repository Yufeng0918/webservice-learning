package com.bp.service;

import com.bp.model.Person;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path(value = "/person")
@Produces("application/xml")
public interface PersonService {

	@GET
	@Path(value = "/profile/{id}")
	public Person getPersonById(@PathParam(value = "id") int id);

	@GET
	@Path(value = "/list")
	public List<Person> getPersonList();

	@GET
	@Path(value = "/list/byAge")
	public List<Person> getPersonListByAge(@QueryParam("minAge") int minAge,
                                           @QueryParam("maxAge") int maxAge);
}
