/**
 * 
 */
package com.coderguide.service;

import java.util.List;

import com.coderguide.model.Employee;
import com.coderguide.model.SuccessModel;

/**
 * @author
 *
 */
public interface EmployeeService {

	public Employee getEmployee(Long id);
	public SuccessModel saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
}
