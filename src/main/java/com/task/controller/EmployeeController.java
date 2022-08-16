package com.task.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.task.dao.EmployeeDAO;
import com.task.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	// adding an initBinder to convert trim input strings
	// remove leading and trailing white space
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmer);
	}
		
		
	@RequestMapping("/employeesList")
	public String getAll(Model model){
		
		List<Employee> employees = employeeDAO.findAll();
		
		model.addAttribute("employees", employees);
		
		return "list-employees";
	}
	
	
	@GetMapping("/showEmployeeForm")
	public String showEmployeeForm(Model model) {
		
		Employee theEmp = new Employee();
		model.addAttribute("employee", theEmp);
		
		return "add-employee";
	}
	
	
	@PostMapping("/addEmployee")
	public String addEmployee(@Valid @ModelAttribute("employee") Employee employee , BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors())
		{
			return "add-employee";
		}else
		  employeeDAO.addEmployee(employee);
		  return "redirect:/employee/employeesList";
		
	}
	
	@GetMapping("/searchForm")
	public String searchForm(Model model) {
		
		Employee theEmp = new Employee();
		model.addAttribute("employee", theEmp);
		return "search-employee";
	}
	
	@RequestMapping("/showResult")
	public String showResult(@ModelAttribute("employee") Employee emp, Model model) {
		

		List<Employee> employees = employeeDAO.findEmployee(emp);

	 	for (Employee employee2 : employees) {
			System.out.println(employee2);
		}
		model.addAttribute("employees", employees);
		return "search-employee";
	}
	
	
//	@RequestMapping("/showResult/emloyeeByCode")
//	public String showResultByCode(@ModelAttribute("employee") Employee emp, Model model) {
//		
//
//		Employee employees = employeeDAO.findEmployeeByCode(emp);
//		   List<Employee> empResult = new ArrayList<>();
//	 	    empResult.add(employees);
////	 	    for (Employee employee : empResult) {
////				System.out.println(employee);
////			}
//		 
//		model.addAttribute("employees", empResult);
//		return "search-employee";
//	}
	
	
	
	
	
	
	
}	
	