package com.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helo")
public class EmployeeController {
	@GetMapping
	public String saySomething() {
		return "hello developer";
		
	}

}
