package com.masai.ServiceEmployee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.EmployeeRepo.EmployeeRepo;
import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;
@Service
public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
	private EmployeeRepo emprepo;

	@Override
	public Employee Addemployee(Employee emp) throws EmployeeException {
		if(emp!=null) {
			Employee em=emprepo.save(emp);
			return em;
		}
		else {
			 throw new EmployeeException("Details not saved"+emp.getName());
		}
	}

	@Override
	public Employee updateemployee(Employee emp) throws EmployeeException {
		Optional<Employee> em=emprepo.findById(emp.getEmployeeid());
	if(em.isPresent()) {
		Employee empl=emprepo.save(emp);
		return empl;
	}
	else {
		throw new EmployeeException("Employee not found");
	}
	
	}

	@Override
	public Employee viewEmployee(Integer EmployeeId) throws EmployeeException {
		Optional<Employee> emp=emprepo.findById(EmployeeId);
		if(emp.isPresent()) {
			Employee em=emp.get();
			return em;
		}
		else {
			throw new EmployeeException("Employee not found in database");
		}
	}

	@Override
	public List<Employee> viewAllEmployee() throws EmployeeException {
	 List<Employee> emplist=emprepo.findAll();
	 if(emplist.size()>0) {
		 return emplist;
	 }
	 else {
			throw new EmployeeException("Employee list is not there in database");
	 }
	}

	@Override
	public Employee removeEmployee(Integer Employeeid) throws EmployeeException {
		Optional<Employee> emp=emprepo.findById(Employeeid);
		if(emp.isPresent()) {
			Employee em=emp.get();
			emprepo.delete(em);
			return em;
		}
		else {
			throw new EmployeeException("Employee not found in database");
		}
	}
	
	
	
}
