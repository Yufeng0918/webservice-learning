package com.dbs.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Student {

	private String studentName;

	private String studentAddr;

	private int studentAge;

	private Teacher teacher;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAddr="
				+ studentAddr + ", studentAge=" + studentAge + ", teacher="
				+ teacher + "]";
	}

}
