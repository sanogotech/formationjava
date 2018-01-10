package com.cnss.demo.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnss.demo.domain.Employee;
import com.cnss.demo.service.EmployeeServiceInterface;


@Controller
public class EmployeeController {

	@Autowired
	EmployeeServiceInterface employeeServiceInterface;
	
	
	@GetMapping("/employee")
	public String savePage(Model model) {
	
		
		model.addAttribute("employee", new Employee());
		model.addAttribute("allPays", employeeServiceInterface.getAllPays());
		model.addAttribute("allEmployees", (ArrayList<Employee>)employeeServiceInterface.getAllEmployees());
		return "employee";
	}
	
	@GetMapping("/charger")
	public String chargerEmploye(@ModelAttribute("empNameload")String empNameload,Model model) {
		System.out.println("************** " + empNameload);
		model.addAttribute("employeeNameLoad", empNameload);
		return "page2";
	}
	
	@PostMapping("/employee/save")
	public String saveEmployee(@ModelAttribute("employee") @Valid Employee employee,BindingResult bindingResult,
			Model model,HttpSession session,HttpServletRequest request, final RedirectAttributes redirectAttributes) {
		
		 if (bindingResult.hasErrors()) {
	            return "employee";
	        }
		
		if(employeeServiceInterface.saveEmployee(employee)!=null) {
			redirectAttributes.addFlashAttribute("saveEmployee", "success");
		} else {
			redirectAttributes.addFlashAttribute("saveEmployee", "unsuccess");
		}
		model.addAttribute("nom", employee.getEmpName());
		session.setAttribute("salaire", employee.getEmpSalary());
		request.setAttribute("datenaissance", employee.getDateNaissance());
		//return "redirect:/employee";
		return "page2";
	}
	
	@RequestMapping(value = "/employee/{operation}/{empId}", method = RequestMethod.GET)
	public String editRemoveEmployee(@PathVariable("operation") String operation,
			@PathVariable("empId") String empId, final RedirectAttributes redirectAttributes,
			Model model) {
		if(operation.equals("delete")) {
			if(employeeServiceInterface.deleteEmployee(empId)) {
				redirectAttributes.addFlashAttribute("deletion", "success");
			} else {
				redirectAttributes.addFlashAttribute("deletion", "unsuccess");
			}
		} else if(operation.equals("edit")){
		  Employee editEmployee = employeeServiceInterface.findEmployee(empId);
		  if(editEmployee!=null) {
		       model.addAttribute("editEmployee", editEmployee);
		       return "editEmployeePage";
		  } else {
			  redirectAttributes.addFlashAttribute("status","notfound");
		  }
		}
		
		return "redirect:/employee";
	}
	
	@RequestMapping(value = "/employee/update", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("editEmployee") Employee editEmployee,
			final RedirectAttributes redirectAttributes) {
		if(employeeServiceInterface.editEmployee(editEmployee)!=null) {
			redirectAttributes.addFlashAttribute("edit", "success");
		} else {
			redirectAttributes.addFlashAttribute("edit", "unsuccess");
		}

		return "redirect:/employee";
	}
	
	@ModelAttribute("countryMap")
	public Map<String,String> populateCountryList() {

		
		return employeeServiceInterface.getMapPays();
	}
	
	
	
}
