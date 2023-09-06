package com.masai.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Employeeid;
	private String name;
	private Integer age;
	private  String Address;
	private long pincode;
	private long salary;
	private LocalDate Datofjoining;
	
	
	public Integer getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		Employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public LocalDate getDatofjoining() {
		return Datofjoining;
	}
	public void setDatofjoining(LocalDate datofjoining) {
		Datofjoining = datofjoining;
	}
	public Employee(Integer employeeid, String name, Integer age, String address, long pincode, long salary,
			LocalDate datofjoining) {
		super();
		Employeeid = employeeid;
		this.name = name;
		this.age = age;
		Address = address;
		this.pincode = pincode;
		this.salary = salary;
		Datofjoining = datofjoining;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Employeeid=" + Employeeid + ", name=" + name + ", age=" + age + ", Address=" + Address
				+ ", pincode=" + pincode + ", salary=" + salary + ", Datofjoining=" + Datofjoining + "]";
	}
	
	
}
