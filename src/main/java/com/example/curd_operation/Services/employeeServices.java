package com.example.curd_operation.Services;

import java.util.List;

import com.example.curd_operation.entites.Employee;

public interface employeeServices {
	
	public List<Employee>getEmployees();
	
	public Employee addEmployee(Employee employee);
	
	public Employee updatedEmployee(Employee employee);

	public Employee deleteEmloyee(long parseLong);
}
