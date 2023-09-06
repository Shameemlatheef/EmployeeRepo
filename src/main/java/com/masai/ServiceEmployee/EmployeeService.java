package com.masai.ServiceEmployee;

import java.util.List;

import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;

public interface EmployeeService {

	public Employee Addemployee(Employee emp) throws EmployeeException;
	
	
	public Employee updateemployee(Employee emp) throws EmployeeException;
	
	public Employee viewEmployee(Integer EmployeeId) throws EmployeeException;
	
	public List<Employee> viewAllEmployee()throws EmployeeException;
	
	
	public Employee removeEmployee(Integer Employeeid) throws EmployeeException;
	
}
