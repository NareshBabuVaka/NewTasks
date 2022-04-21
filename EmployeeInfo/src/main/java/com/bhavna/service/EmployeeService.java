package com.bhavna.service;

import java.util.List;

import com.bhavna.entity.EmployeeEntity;

public interface EmployeeService {

	public String saveEmployee(EmployeeEntity employee);

	public List<EmployeeEntity> getEmployees();

}
