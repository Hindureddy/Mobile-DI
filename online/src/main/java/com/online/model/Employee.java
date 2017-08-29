package com.online.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Employee_Details")
public class Employee {

	@Id
	@Column(name = "employee_ID")
	private Long empId;
	
@Column(name="Name")
	private String name;
	
	@Column(name = "Hiredate")
    @Temporal(value = TemporalType.TIMESTAMP)
	private Date date_of_joining;
	
	@Column(name="Job")
	private String  designation;
	
	@Column(name="Salary")
	private  Long salary;
	
	

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	 @Override
	public String toString() {
		return "empId : "+empId+",name :"+name+",date_of_joining :"+date_of_joining+"," +
				"designation :"+designation+",salary :"+salary;
	}
	
}
