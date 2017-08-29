package com.online.dao;

import java.util.Set;

import com.online.model.Department;
import com.online.model.Employee;

public interface Employee_Dept_Dao {

	 Department insertEmployeeDetails(Department dept);

	 
	 Set<Employee> GetEmployeeDetails(Department dept);

}
