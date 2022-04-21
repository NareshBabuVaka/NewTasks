package com.bhavna.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bhavna.entity.EmployeeEntity;
import com.bhavna.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepositary;

	@Override
	public String saveEmployee(EmployeeEntity employee) {

		employeeRepositary.save(employee);
		return "The data entered by you is inserted successfully...";

	}

	@Override
	public List<EmployeeEntity> getEmployees() {

		List<EmployeeEntity> employees = employeeRepositary.findAll(Sort.by(Sort.Direction.ASC, "employeeName"));
		return employees;

//		   List<EmployeeEntity> employees = employeeRepositary.findAll();
//		    Collections.sort(employees); 
//		    return employees;
//		 

//		  List<EmployeeEntity> newEmployees = new ArrayList<>(); List<EmployeeEntity>
//		  employees = employeeRepositary.findAll(); Collections.sort(employees);
//		  Iterator<EmployeeEntity> iterator = employees.iterator(); while
//		  (iterator.hasNext()) { newEmployees.add(iterator.next()); } return
//		  newEmployees;
//		 

	}

}
