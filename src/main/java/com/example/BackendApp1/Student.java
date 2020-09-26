package com.example.BackendApp1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	public Student() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "StudentName")
	private String name;
	@Column(name = "RollNum")
	private int rollNum;
	@Column(name = "Class")
	private String whichClass;
	
	public Student(int id, String name, int rollNum, String whichClass) {
		super();
		this.id = id;
		this.name = name;
		this.rollNum = rollNum;
		this.whichClass = whichClass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getWhichClass() {
		return whichClass;
	}

	public void setWhichClass(String whichClass) {
		this.whichClass = whichClass;
	}
	
}
