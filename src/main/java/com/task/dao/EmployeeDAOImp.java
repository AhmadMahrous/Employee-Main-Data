package com.task.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.task.entity.Employee;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		
		List<Employee> employee = query.getResultList();
		
		return employee;
	}

	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		
		 Session session = sessionFactory.getCurrentSession();
		 Query<Employee> query = session.createQuery("from Employee e where e.id = (select max(c.id) from Employee c)", Employee.class);
		 Employee emp = query.getSingleResult();
		 
		 employee.setEmployeeCode(emp.getEmployeeCode() + 10);
		  session.save(employee);
	}

	@Override
	@Transactional
	public List<Employee> findEmployee(Employee employee) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Employee> q = session.createQuery("from Employee" + 
												"i where i.employeeCode= ?1 " +
												"or i.firstName= ?2 " +
												"or i.lastName= ?3 " +
												"or i.birthDate= ?4 "+
												"or i.birthCity= ?5 "+
												"or i.id= ?6 " +
												"or i.employeeDepartment= ?7 " +
												"or i.jobTitle= ?8" +
												"or i.employeeStatus= ?9 " +
												"or i.contractType= ?10 "
												,Employee.class);
	 	q.setParameter(1, employee.getEmployeeCode());
	 	q.setParameter(2, employee.getFirstName());
	 	q.setParameter(3, employee.getLastName());
	 	q.setParameter(4, employee.getBirthDate());
	 	q.setParameter(5, employee.getBirthCity());
	 	q.setParameter(6, employee.getId());
	 	q.setParameter(7, employee.getEmployeeDepartment());
	 	q.setParameter(8, employee.getJobTitle());
	 	q.setParameter(9, employee.getEmployeeStatus());
	 	q.setParameter(10, employee.getContractType());
	 	
	 	List<Employee> employees = q.getResultList();
	 	
		return employees;
	}

	@Override
	@Transactional
	public Employee findEmployeeByCode(Employee employee) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Employee> query = session.createQuery("from Employee e where e.employeeCode = ?1", Employee.class);
		query.setParameter(1, employee.getEmployeeCode());
		Employee emp = query.getSingleResult();
		
		System.out.println(emp);
		return emp;
	}

	
	
	 

}
