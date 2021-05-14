package com.nagarro.hrManagement.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.nagarro.hrManagement.constant.Constant;
import com.nagarro.hrManagement.model.EmployeeDetails;
import com.nagarro.hrManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired RestTemplate restTemplate;
	
	@Override
	public void editEmployeeDetails(EmployeeDetails emp) {
		
		try {
			restTemplate.put ( Constant.REST_SERVICE_URI+"editEmployee", emp);
		} catch (RestClientException ex) {
			System.out.println(ex);
		}  
		
	}
	
	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {

		ResponseEntity<EmployeeDetails[]> response = null;
		
		try {
			 response = restTemplate.getForEntity(Constant.REST_SERVICE_URI+"getEmployees",
					EmployeeDetails[].class);
		} catch (RestClientException ex) {
			
			System.out.println(ex);
		}
		
		return Arrays.asList(response.getBody());
	}

	
	@Override 
	@SuppressWarnings("unused")
	public void addEmployeeDetails(EmployeeDetails empDetails) {

		try {
			
			EmployeeDetails emp = restTemplate.postForObject(Constant.REST_SERVICE_URI+"addEmployee", empDetails, EmployeeDetails.class);

		} catch (RestClientException ex) {
			
			System.out.println(ex);
		}
		
	}

}
