package com.online.daoImpl;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.dao.Employee_Dept_Dao;
import com.online.model.Department;
import com.online.model.Employee;


@Repository("emp_DeptDao")

public class Employee_Dept_DaoImpl implements  Employee_Dept_Dao{

	
	/*Session session = HibernateUtil.getSessionFactory().openSession();
	org.hibernate.Transaction trns = session.beginTransaction();
*/
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	//@Transactional
	public Department insertEmployeeDetails(Department dept) {
		Session session = this.sessionFactory.openSession();
		Transaction trns=	session.beginTransaction();

		session.save(dept);
			trns.commit();
		return dept;
	}

	@Override
	public Set<Employee> GetEmployeeDetails(Department dept) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		
		dept = session.get(Department.class, dept.getDeptno());
	    		 
	    Set<Employee> employees = dept.getEmployees();

	   		return employees;
	}
	
}
