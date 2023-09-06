package com.masai.ControllerEmployee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;
import com.masai.ServiceEmployee.EmployeeService;

@RestController
public class EmployeeController {
     @Autowired
	private EmployeeService empservice;
     
     @PostMapping("/register")
     public ResponseEntity<Employee> RegisterEmployee(@RequestBody Employee empl) throws EmployeeException{
    	 Employee emp=empservice.Addemployee(empl);
    	 return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
    	 
    	 
     }
     @PutMapping("/updateEmployee")
     public ResponseEntity<Employee> UpdateEmployee(@RequestBody Employee empl) throws EmployeeException{
    	 Employee emp=empservice.updateemployee(empl);
    	 return new ResponseEntity<Employee>(emp,HttpStatus.OK);
    	 
    	 
     }
     @GetMapping("/viewEmployee")
     public ResponseEntity<Employee> ViewEmployee(@RequestParam Integer Employeeid) throws EmployeeException{
    	 Employee emp=empservice.viewEmployee(Employeeid);
    	 return new ResponseEntity<Employee>(emp,HttpStatus.OK);
    	 
    	 
     }
     @GetMapping("/ViewAllEmployee")
     public ResponseEntity<List<Employee>> ViewAllEmployee() throws EmployeeException{
    	List<Employee> emplist=empservice.viewAllEmployee();
    	 return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);
    	 
    	 
     }
     @DeleteMapping("/DeleteEmployee")
     public ResponseEntity<Employee> DeleteEmployee(@RequestParam Integer Employeeid) throws EmployeeException{
    	 Employee emp=empservice.removeEmployee(Employeeid);
    	 return new ResponseEntity<Employee>(emp,HttpStatus.OK);
    	 
    	 
     }
//	
	
}
