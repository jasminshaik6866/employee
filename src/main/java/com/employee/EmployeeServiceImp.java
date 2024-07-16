package com.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepositary employeeRepositary;

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepositary.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return this.employeeRepositary.findAll();
	}


    @Override
    public Employee getByEmployeeId(Integer id) {
        Optional<Employee> employee = employeeRepositary.findById(id);
        return employee.orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
    }

	
    
	
	  @Override 
	  public Employee updateEmployee(Integer id, Employee employee) { 
		     Employee employeedb = getByEmployeeId(id);
	  
		     employeedb.setName(employee.getName());
		     employeedb.setSalary(employee.getSalary());
		     employeedb.setDob(employee.getDob());
		     employeedb.setYearOfJoining(employee.getYearOfJoining());
	  
	  return employeeRepositary.save(employeedb);
	  }
	  
	  @Override
	    public void deleteEmployeeById(Integer id) {
	        Employee employee = getByEmployeeId(id);
	        employeeRepositary.delete(employee);
	    }

	
	 

}
