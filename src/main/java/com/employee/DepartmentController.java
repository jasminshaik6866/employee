package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/addDepartment")
	public ResponseEntity<Department> postMethodName(@RequestBody Department departmenty) {

		return ResponseEntity.ok().body(this.departmentService.saveDepartment(departmenty));
	}

	@GetMapping("getDepartment")
	public ResponseEntity<List<Department>> getDepartment() {
		return ResponseEntity.ok().body(this.departmentService.getDepartment());

	}

	@GetMapping("/getDepartment/{name}")
	public ResponseEntity<Department> getDepartmentByName(@PathVariable String name) {
		Department department = departmentService.getDepartmentByName(name);
		if (department != null) {
			return ResponseEntity.ok().body(department);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	  @DeleteMapping("/deleteDepartment/{id}")
	    public ResponseEntity<Void> deleteDepartment(@PathVariable Integer id) {
		  departmentService.deleteDepartmentById(id);
	        return ResponseEntity.noContent().build();
	    }

}
