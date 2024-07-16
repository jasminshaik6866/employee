package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentRepositary departmentRepositary;

	@Override
	public Department saveDepartment(Department departmenty) {
		
		return departmentRepositary.save(departmenty);
	}

	@Override
	public List<Department> getDepartment() {
		
		return departmentRepositary.findAll() ;
	}

	@Override
	public Department getDepartmentByName(String name) {
		
		return departmentRepositary.findByName(name);
	}
	
	  @Override 
	  public void deleteDepartmentById(Integer id) {
		  Department department = getByDepartmentId(id);
		  departmentRepositary.delete(department);
	  }
	 
	
	/*
	 * @Override public void deleteDepartmentById(Integer id) { Department
	 * department = getByDepartmentId(id); if (department != null) {
	 * departmentRepositary.delete(department); } else { throw new
	 * ResourceNotFoundException("Department not found with id: " + id); } }
	 */

	private Department getByDepartmentId(Integer id) {
	
		return departmentRepositary.findById(id).orElse(null);
	}



}


	
	


