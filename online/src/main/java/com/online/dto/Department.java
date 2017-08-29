package com.online.dto;

import java.util.HashSet;
import java.util.Set;



public class Department {

	
	private int deptno;
	private String deptName;
	private  String deptLocation;
	private Set<Employee> employees = new HashSet();
	
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

}
