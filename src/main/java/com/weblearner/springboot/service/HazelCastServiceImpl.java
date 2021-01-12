package com.weblearner.springboot.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.weblearner.springboot.model.Employee;

@Service
public class HazelCastServiceImpl implements HazelCastService {

	@Cacheable("allemployee")
	public List<Employee> getEmployees() {

		System.out.println("Start of the method " + LocalDateTime.now());
		LocalTime startTime = LocalTime.now();

		List<Employee> empLst = setEmployeeDetails();

		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LocalTime endTime = LocalTime.now();

		System.out.println("Processing time of the method " + ChronoUnit.SECONDS.between(startTime, endTime));

		return empLst;
	}

	private List<Employee> setEmployeeDetails() {

		List<Employee> empLst = new ArrayList<Employee>();

		Employee emp1 = new Employee();
		emp1.setName("Sam");
		emp1.setDept("IT");
		emp1.setSalary("7000USD");

		Employee emp2 = new Employee();
		emp2.setName("Tom");
		emp2.setDept("Finance");
		emp2.setSalary("5000USD");

		empLst.add(emp1);
		empLst.add(emp2);
		return empLst;

	}

}
