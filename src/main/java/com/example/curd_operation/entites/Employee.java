package com.example.curd_operation.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private long id;
	private String Name;
	private  String Address;
	private  String email;
	public Employee(long id, String name, String address, String email) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
