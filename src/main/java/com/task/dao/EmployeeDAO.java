package com.task.dao;

import java.util.List;

import com.task.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	public List<Employee> findEmployee(Employee employee);
	public Employee findEmployeeByCode(Employee employee);
	public void addEmployee(Employee employee);
}
