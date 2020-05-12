package com.bp.service.impl;

import com.bp.model.Person;
import com.bp.service.PersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPersonById(int id) {

		Person person = new Person();
		person.setId(id);
		person.setAge(29);
		person.setName("Yufeng");
		person.setAddress("Singapore");

		System.out.println(person.toString());
		return person;
	}

	@Override
	public List<Person> getPersonList() {

		List<Person> list = new ArrayList<Person>();

		for (int i = 0; i < 10; i++) {
			Person person = new Person();
			person.setId(i);
			person.setName("User" + i);
			person.setAge(30);
			person.setAddress("Address " + i);
			list.add(person);
		}
		return list;
	}

	@Override
	public List<Person> getPersonListByAge(int minAge, int maxAge) {

		List<Person> list = new ArrayList<Person>();

		for (int i = 7; i < 9; i++) {
			Person person = new Person();
			person.setId(i);
			person.setName("User" + i);
			person.setAge(20);
			person.setAddress("Address " + i);
			list.add(person);
		}
		return list;
	}

}
