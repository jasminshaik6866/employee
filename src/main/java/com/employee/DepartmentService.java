package com.employee;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {

	Department saveDepartment(Department departmenty);

	List<Department> getDepartment();

	Department getDepartmentByName(String name);

	void deleteDepartmentById(Integer id);

}
