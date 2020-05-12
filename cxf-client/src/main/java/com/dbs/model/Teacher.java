package com.dbs.model;

public class Teacher {

	private String teacherName;

	private String teacherAddr;

	private int teacherAge;

	private Head head;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherAddr() {
		return teacherAddr;
	}

	public void setTeacherAddr(String teacherAddr) {
		this.teacherAddr = teacherAddr;
	}

	public int getTeacherAge() {
		return teacherAge;
	}

	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", teacherAddr="
				+ teacherAddr + ", teacherAge=" + teacherAge + ", head=" + head
				+ "]";
	}

}
