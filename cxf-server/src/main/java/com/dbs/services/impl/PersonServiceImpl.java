package com.dbs.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.dbs.model.Person;
import com.dbs.services.PersonService;

import javax.jws.WebService;

@WebService(targetNamespace = "http://services.dbs.com/")
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Person> getPerson() {
		List<Person> list = new ArrayList<Person>();

		list.add(new Person());
		list.add(new Person());
		list.add(new Person());
		list.add(new Person());

		return list;
	}
}
