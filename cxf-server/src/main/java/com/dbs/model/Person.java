package com.dbs.model;

public class Person {

	private String name;

	private String homeAddress;

	private String companyAddress;

	public Person() {
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10; ++i) {
			sb.append("x");
		}

		this.name = sb.toString();
		this.homeAddress = sb.toString();
		this.companyAddress = sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
}
