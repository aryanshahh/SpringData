package com.demo.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.demo.model.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, String>{

	List<Employee> findByFirstname(String firstName);

}