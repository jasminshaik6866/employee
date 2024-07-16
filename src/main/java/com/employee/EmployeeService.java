package com.employee;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee getByEmployeeId(Integer id);

	Employee updateEmployee(Integer id, Employee employee);

	void deleteEmployeeById(Integer id);

}
