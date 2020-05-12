package com.dbs.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.dbs.model.Person;

@WebService
public interface PersonService {

	@WebMethod
	@WebResult(name = "personResult")
	public List<Person> getPerson();
}
