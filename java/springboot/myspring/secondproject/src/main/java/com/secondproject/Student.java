package com.secondproject;

public class Student {
	int roll;
	String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
