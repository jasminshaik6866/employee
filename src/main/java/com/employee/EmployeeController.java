package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> postMethodName(@RequestBody Employee employee) {

		return ResponseEntity.ok().body(this.employeeService.saveEmployee(employee));
	}

	@GetMapping("/getEmployee")
	public ResponseEntity<List<Employee>> getAllProduct() {
		return ResponseEntity.ok().body(this.employeeService.getAllEmployee());

	}

	@GetMapping("/getByEmployeeId/{id}")

	public ResponseEntity<Employee> getByEmployeeId(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.employeeService.getByEmployeeId(id));
	}

	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> updateProduct(@PathVariable Integer id, @RequestBody Employee employee) {
		employee.setId(id);
		return ResponseEntity.ok().body(this.employeeService.updateEmployee(id,employee));
	}
	
	  @DeleteMapping("/deleteEmployee/{id}")
	    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
	        employeeService.deleteEmployeeById(id);
	        return ResponseEntity.noContent().build();
	    }
	

}
