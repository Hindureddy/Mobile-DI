package com.online.serviceImpl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.dao.Employee_Dept_Dao;
import com.online.model.Department;
import com.online.model.Employee;
import com.online.service.Employee_Dept_Service;


@Service("emp_DeptService")
@Transactional
public class Employee_DeptServiceImpl implements  Employee_Dept_Service{
	
	
	@Resource(name = "emp_DeptDao")
	private Employee_Dept_Dao employee_Dept_Dao;

		
	@Override
	public Department insertEmployeeDetails(Department deptDetls) {
			
		employee_Dept_Dao.insertEmployeeDetails(deptDetls);
		return deptDetls;
	}


	@Override
	public Set<Employee> getEmployeeDetails(Department dept) {
		Set<Employee> employees =employee_Dept_Dao.GetEmployeeDetails(dept);
		
		return employees;
	}


}
