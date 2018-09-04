package com.cg.eis.bean;

import com.cg.eis.service.Service;

public class Employee {

	public int id;
	public String name;
	public double salary;
	public String d;
	//service  scheme;

	public Employee()
	{
		
	}
	public Employee(int id, String name, double salary, String d, Service scheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
	}
	
	
	
	
}
