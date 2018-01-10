package com.cnss.demo.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import com.cnss.demo.domain.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, String>{
	
	   
	/* @RestResource(path="getBooksByAuthor")
	 public List<Book> findBy(@Param("author") String author); */
	
}
