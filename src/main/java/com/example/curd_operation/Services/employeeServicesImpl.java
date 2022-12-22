package com.example.curd_operation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curd_operation.dao.employeedao;
import com.example.curd_operation.entites.Employee;

@Service
public class employeeServicesImpl implements  employeeServices {

	@Autowired
	private employeedao employeedao;

	@Override
	public List<Employee> getEmployees() {
			return employeedao.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {

		employeedao.save(employee);
		return employee;
	}

	@Override
	public Employee updatedEmployee(Employee employee) {
		employeedao.save(employee);
		return employee;
	}

	@Override
	public Employee deleteEmloyee(long parseLong) {
		Employee entity=employeedao.getOne(parseLong);
		employeedao.delete(entity);
		return entity;
		
	}
	
	

}