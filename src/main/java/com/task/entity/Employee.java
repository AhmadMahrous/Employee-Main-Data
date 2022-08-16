package com.task.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	
	
	@Column(name="employee_code")
	private Integer employeeCode;
	
	@NotNull(message = "first name is required")
	@Size(min = 1, message ="first name is required")
	@Column(name="first_name")
	private String firstName;
	
	@NotNull(message = "last name is required")
	@Size(min = 1, message ="last name is required")
	@Column(name="last_name")
	private String lastName;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@NotNull(message="birth date is required")
	@Past(message = "Invalid Input")
	@Column(name="birth_date")
	private Date birthDate;
	
	@NotNull(message = "birth city is required")
	@Size(min = 1, message ="birth city is required")
	@Column(name="birth_city")
	private String birthCity;
	
	@NotNull(message = "department is required")
	@Size(min = 1, message ="department is required")
	@Column(name="employee_department")
	private String employeeDepartment;
	
	@NotNull(message = "job title is required")
	@Size(min = 1, message ="job title name is required")
	@Column(name="job_title")
	private String jobTitle;
	
	@NotNull(message = "status is required")
	@Size(min = 1, message ="status is required")
	@Column(name="employee_status")
	private String employeeStatus;
	
	@NotNull(message = "contract type is required")
	@Size(min = 1, message ="first name is required")
	@Column(name="contract_type")
	private String contractType;
	
	
	// default constructor
	public Employee() {}
    

	public Employee(Integer id, Integer employeeCode,
			 String firstName,
			 String lastName,
			 Date birthDate,
			 String birthCity,
			 String employeeDepartment,
			 String jobTitle,
			 String employeeStatus,
			 String contractType) {
		this.id = id;
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.birthCity = birthCity;
		this.employeeDepartment = employeeDepartment;
		this.jobTitle = jobTitle;
		this.employeeStatus = employeeStatus;
		this.contractType = contractType;
	}


	// getter and setter methods
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getEmployeeCode() {
		return employeeCode;
	}


	public void setEmployeeCode(Integer employeeCode) {
		this.employeeCode = employeeCode;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate =  birthDate;
	}


	public String getBirthCity() {
		return birthCity;
	}


	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}


	public String getEmployeeDepartment() {
		return employeeDepartment;
	}


	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getEmployeeStatus() {
		return employeeStatus;
	}


	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}


	public String getContractType() {
		return contractType;
	}


	public void setContractType(String contractType) {
		this.contractType = contractType;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + "," 
				+" employeeCode=" + employeeCode + "," 
				+ " firstName=" + firstName + ","
				+ " lastName=" + lastName
				+ ", birthDate=" + birthDate
				+ ", birthCity=" + birthCity
				+ ", employeeDepartment=" + employeeDepartment 
				+ ", jobTitle=" + jobTitle 
				+ ", employeeStatus="+ employeeStatus 
				+ ", contractType=" + contractType + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}














