package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public void saveEmployee(EmployeeEntity emp) {
		service.saveEmployee(emp);
	
	
}
	
	  @GetMapping("empl/{id}")
	  public EmployeeEntity getEmployeeById(@PathVariable("id") Long id) throws UserNotFoundException {
	  EmployeeEntity entity = service.getEmployeeById(id);
	  return entity;
	  }
	 
	
	  @GetMapping
	  public List<EmployeeEntity> getAllEmployees() {
	        List<EmployeeEntity> list = service.getAllEmployees();
	        return list;
	 
	        //return new List<EmployeeEntity>(list, new HttpHeaders(), HttpStatus.OK);
	    }
	 

}
