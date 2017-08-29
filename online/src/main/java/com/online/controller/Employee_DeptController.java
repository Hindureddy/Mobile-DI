package com.online.controller;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.model.Department;
import com.online.model.Employee;
import com.online.service.Employee_Dept_Service;
import com.online.constants.OnlineRestUris;




@RestController
public class Employee_DeptController {

	
	@Resource(name="emp_DeptService")
	private Employee_Dept_Service  employee_Dept_Service;
	
	@PostMapping(OnlineRestUris.CREATE_EMPLOYEE_DEPARTMENT)
	public Department addNewEmployee(@RequestBody Department dept){
		
		Department  departments=employee_Dept_Service.insertEmployeeDetails(dept);
		
		return departments;
    }
	
	@GetMapping(OnlineRestUris.GET_EMPLOYEE_INFORMATION)
	public @ResponseBody  Set<Employee> getEmployees(@PathVariable String   deptno){

		long deptNo=Long.valueOf(deptno);
		
		Department d=new Department();
		d.setDeptno(deptNo);

		Set<Employee>  emp=employee_Dept_Service.getEmployeeDetails(d);

		
		return emp;
    }
	
	
}
