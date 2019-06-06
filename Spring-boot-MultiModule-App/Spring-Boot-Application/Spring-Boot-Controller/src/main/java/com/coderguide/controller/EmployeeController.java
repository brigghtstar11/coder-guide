/**
 * 
 */
package com.coderguide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coderguide.model.Employee;
import com.coderguide.model.SuccessModel;
import com.coderguide.service.EmployeeService;

/**
 * @author
 *
 */
@RestController
@RequestMapping(path = "rest/api")
public class EmployeeController {

	@Autowired
	private EmployeeService _employeeService;
	
	@RequestMapping(value = "/employee/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployee(@PathVariable(value="id") Long id) {
		
		return new ResponseEntity<>(_employeeService.getEmployee(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveEmployee", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SuccessModel> addEmployee(@RequestBody Employee employee) {
		
		return new ResponseEntity<>(_employeeService.saveEmployee(employee), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/allEmployee", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmployee() {
		
		return new ResponseEntity<>(_employeeService.getAllEmployee(), HttpStatus.OK);
	}
}
