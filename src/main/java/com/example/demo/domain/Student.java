package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String studentname;
	private String course;
	private int fee;


	public Student() {
		super();
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getStudentName() {
		return studentname;
	}


	public void setStudentName(String studentname) {
		this.studentname = studentname;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getFees() {
		return fee;
	}


	public void setFees(int fees) {
		this.fee = fees;
	}
	
}