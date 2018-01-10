package com.cnss.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cnss.demo.domain.Employee;
import com.cnss.demo.domain.Pays;


public interface EmployeeServiceInterface {

	public Employee saveEmployee(Employee emp);
	public Boolean deleteEmployee(String empId);
	public Employee editEmployee(Employee emp);
	public Employee findEmployee(String empId);
	public Collection<Employee> getAllEmployees();
	public List<Pays> getAllPays();
	public Map<String,String> getMapPays();
}
