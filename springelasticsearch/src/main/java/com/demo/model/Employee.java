package com.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName="employeeidx", shards=1, replicas=0, refreshInterval="1s", createIndex = true)
public class Employee {
	
	@Id
	private String id;
	private String firstname;
	private String lastname;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	  public String toString() {
	    return "Document{" +
	        "id='" + id + '\'' +
	        ", firstname='" + firstname + '\'' +
	        ", lastname='" + lastname + '\'' +
	           ", age='" + age + '\'' +
	        '}';
	  }

}