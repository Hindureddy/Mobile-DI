package com.online.service;

import java.util.Set;

import com.online.model.Department;
import com.online.model.Employee;

public interface Employee_Dept_Service {

	
	Department  insertEmployeeDetails(Department dept);
	
	Set<Employee> getEmployeeDetails(Department dept);

	
}
