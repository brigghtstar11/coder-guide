/**
 * 
 */
package com.coderguide.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderguide.model.Employee;
import com.coderguide.model.SuccessModel;

/**
 * @author
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private SuccessModel _successModel;
	private HashMap<Long, Employee> _employeeMap	=	new HashMap<>();
	
	@Override
	public Employee getEmployee(Long id) {
		return _employeeMap.get(id);
	}

	@Override
	public SuccessModel saveEmployee(Employee emp) {
		_employeeMap.put(emp.getId(), emp);
		return _successModel;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return new ArrayList<Employee>(_employeeMap.values());
	}

}
