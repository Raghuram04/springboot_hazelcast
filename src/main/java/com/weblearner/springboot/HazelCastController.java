package com.weblearner.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weblearner.springboot.model.Employee;
import com.weblearner.springboot.service.HazelCastService;

@RestController
public class HazelCastController {

	@Autowired
	private HazelCastService service;

	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		return service.getEmployees();
	}

}
