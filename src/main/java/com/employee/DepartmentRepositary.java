package com.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DepartmentRepositary extends JpaRepository<Department, Integer>{

	Department findByName(String name);

	

}
