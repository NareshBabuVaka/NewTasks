/*   Expose the below end points



* POST /api/Employee : To Save an Employee Details
* GET /api/Employee : Retrieve all the Employees present, and the repsone should be sorted by name*/

package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.EmployeeEntity;
import com.bhavna.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/Employee")
	public List<EmployeeEntity> getAllEmployees() {
		return employeeService.getEmployees();

	}

	@PostMapping("/Employee")
	public String saveEmployee(@RequestBody EmployeeEntity employee) {
		employeeService.saveEmployee(employee);
		return "The data entered by you is saved successfully...";
	}

}
