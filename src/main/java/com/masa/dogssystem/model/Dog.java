package com.masa.dogssystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Dog class is a JPA entity which is linked
//to relational database as a table.
public class Dog {
	@Id // This will make a primary key
	// Clarifies auto-increment behaviour for the primary key (id field)
	// auto-increment behaviour -> a column(mainly primary key) automatically gets a
	// unique&sequential #
	// whenever a new record is inserted
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private int age;
	private String name;
	private String address;
	private String type;

	public Dog() {
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getType() {
		return type;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setType(String type) {
		this.type = type;
	}
}
