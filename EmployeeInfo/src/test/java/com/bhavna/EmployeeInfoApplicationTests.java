package com.bhavna;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.bhavna.entity.EmployeeEntity;
import com.bhavna.repository.EmployeeRepository;
import com.bhavna.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeInfoApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepository employeeRepository;

	@Test
	public void getEmployeesTest() {
		when(employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "employeeName"))).thenReturn(Stream
				.of(new EmployeeEntity(11111111, "Bnm", 23, 23900.00, "Software Enginner", "Male"),
						new EmployeeEntity(2222222, "mak", 23, 26900.00, "Software Enginner", "Male"))
				.collect(Collectors.toList()));
		assertEquals(2, employeeService.getEmployees().size());
	}

	@Test
	public void saveEmployeeTest() {
		EmployeeEntity employeeEntity = new EmployeeEntity(11111111, "Bnm", 23, 23900.00, "Software Enginner", "Male");
		when(employeeRepository.save(employeeEntity)).thenReturn(employeeEntity);
		assertEquals(employeeEntity, employeeService.saveEmployee(employeeEntity));
	}

}
