package com.masai.EmployeeRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
