package com.dbs.model;

public class Director {

	private String directorName;

	private String directorAddr;

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getDirectorAddr() {
		return directorAddr;
	}

	public void setDirectorAddr(String directorAddr) {
		this.directorAddr = directorAddr;
	}

	@Override
	public String toString() {
		return "Director [directorName=" + directorName + ", directorAddr="
				+ directorAddr + "]";
	}

}
