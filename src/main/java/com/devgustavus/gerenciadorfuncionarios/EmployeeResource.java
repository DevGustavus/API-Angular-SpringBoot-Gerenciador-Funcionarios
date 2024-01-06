package com.devgustavus.gerenciadorfuncionarios;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devgustavus.gerenciadorfuncionarios.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	private final EmployeeService employeeService;
	
	public EmployeeResource(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
}
