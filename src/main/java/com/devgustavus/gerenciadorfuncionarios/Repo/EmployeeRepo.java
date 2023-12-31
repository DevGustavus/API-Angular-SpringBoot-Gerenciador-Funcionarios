package com.devgustavus.gerenciadorfuncionarios.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgustavus.gerenciadorfuncionarios.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);
	
}
