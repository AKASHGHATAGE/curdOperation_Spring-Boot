package com.example.curd_operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.curd_operation.Services.employeeServices;
import com.example.curd_operation.entites.Employee;




@RestController
public class curdController {

	@Autowired
	private employeeServices employeeServices;
	
	@GetMapping("/home")
	public String home() {
		return "Akash ghatage";
	}
	
	@GetMapping("/employee")
	public java.util.List<Employee>getEmployees(){
		return this.employeeServices.getEmployees();
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.employeeServices.addEmployee(employee);
	}
	
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return this.employeeServices.updatedEmployee(employee);
	}
	
	@DeleteMapping("/Empolyee/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String id){
		try {
			this.employeeServices.deleteEmloyee(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}