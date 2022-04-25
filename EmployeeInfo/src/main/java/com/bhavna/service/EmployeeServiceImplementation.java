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
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {

		return employeeRepositary.save(employee);

	}

	@Override
	public List<EmployeeEntity> getEmployees() {

		List<EmployeeEntity> employees = employeeRepositary.findAll(Sort.by(Sort.Direction.ASC, "employeeName"));
		return employees;

//		List<EmployeeEntity> employees = employeeRepositary.findAll();
//		Collections.sort(employees);
//		System.out.println("Getting data from DB : " + employees);
//
//		return employees;

//		  List<EmployeeEntity> newEmployees = new ArrayList<>(); List<EmployeeEntity>
//		  employees = employeeRepositary.findAll(); Collections.sort(employees);
//		  Iterator<EmployeeEntity> iterator = employees.iterator(); while
//		  (iterator.hasNext()) { newEmployees.add(iterator.next()); } return
//		  newEmployees;
//		 

	}

}
