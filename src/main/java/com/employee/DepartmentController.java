package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	/*
	 * @PostMapping("/addDepartment") public ResponseEntity<List<Department>>
	 * postMethodName(@RequestBody Department departmenty) {
	 * 
	 * return
	 * ResponseEntity.ok().body(this.departmentService.saveDepartment(departmenty));
	 * }
	 */
}
