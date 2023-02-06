package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@SpringBootApplication
@RestController
public class SpringelasticsearchApplication {
	
	@Autowired
	public EmployeeRepository repository;
	
	@PostMapping("/saveEmployee")
	public int saveEmployee(@RequestBody List<Employee> Employees) {
		System.out.println(Employees.toString());
		repository.saveAll(Employees);
		return Employees.size();
	}

	@GetMapping("/findEverything")
	public Iterable<Employee> findAllEmployees() {
		return repository.findAll();
	}

	@GetMapping("/findByFName/{firstName}")
	public List<Employee> findByFirstName(@PathVariable String firstName) {
		return repository.findByFirstname(firstName);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringelasticsearchApplication.class, args);
	}
}