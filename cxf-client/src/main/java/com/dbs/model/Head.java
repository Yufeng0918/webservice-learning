package com.dbs.model;

public class Head {

	private String headName;

	private String headAddr;

	private int headAge;

	private Director director;

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

	public String getHeadAddr() {
		return headAddr;
	}

	public void setHeadAddr(String headAddr) {
		this.headAddr = headAddr;
	}

	public int getHeadAge() {
		return headAge;
	}

	public void setHeadAge(int headAge) {
		this.headAge = headAge;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Head [headName=" + headName + ", headAddr=" + headAddr
				+ ", headAge=" + headAge + ", director=" + director + "]";
	}


}
