package com.nagarro.hrManagement.service;

import java.util.List;

import com.nagarro.hrManagement.model.EmployeeDetails;

public interface EmployeeService {

	public void editEmployeeDetails(EmployeeDetails emp);
	public List<EmployeeDetails> getAllEmployeeDetails();
	public void addEmployeeDetails(EmployeeDetails emp);
}
