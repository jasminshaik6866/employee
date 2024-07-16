package com.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Integer>{

	Employee save(Employee employee);

	Employee getByid(Integer id);

	




}
