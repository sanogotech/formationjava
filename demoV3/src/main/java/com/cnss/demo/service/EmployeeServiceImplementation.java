package com.cnss.demo.service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnss.demo.domain.Employee;
import com.cnss.demo.domain.Pays;
import com.cnss.demo.repository.EmployeeRepository;
import com.cnss.demo.repository.PaysRepository;


@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeServiceInterface{

	@Autowired
	protected EmployeeRepository employeeRepository;
	
	@Autowired
	protected PaysRepository paysRepository;

	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

	@Override
	public Boolean deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		Employee temp = employeeRepository.findOne(empId);
		if(temp!=null){
			 employeeRepository.delete(temp);
			 return true;
		}
		return false;
	}

	@Override
	public Employee editEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Iterable<Employee> itr = employeeRepository.findAll();
		return (Collection<Employee>)itr;
	}

	@Override
	public Employee findEmployee(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(empId);
	}

	@Override
	public List<Pays> getAllPays() {
		return paysRepository.findAll();
	}

	@Override
	public Map<String, String> getMapPays() {
		Map<String,String> countryMap = new LinkedHashMap<String,String>();
		
		List<Pays> listPays = paysRepository.findAll();
		for (Pays pays : listPays) {
			countryMap.put(pays.getCode(), pays.getDescription());
		}
		return countryMap;
	}
	

}
