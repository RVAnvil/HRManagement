/*
 * package com.nagarro.hrManagement.service.impl;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.client.RestClientException; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import com.nagarro.hrManagement.constant.Constant; import
 * com.nagarro.hrManagement.model.EmployeeDetails; import
 * com.nagarro.hrManagement.service.UploadEmployeeSevice;
 * 
 * @Service public class UploadEmployeeServiceImpl implements
 * UploadEmployeeSevice {
 * 
 * @Autowired RestTemplate restTemplate;
 * 
 * @Override
 * 
 * @SuppressWarnings("unused") public void addEmployeeDetails(EmployeeDetails
 * empDetails) {
 * 
 * try {
 * 
 * EmployeeDetails emp =
 * restTemplate.postForObject(Constant.REST_SERVICE_URI+"addEmployee",
 * empDetails, EmployeeDetails.class);
 * 
 * } catch (RestClientException ex) {
 * 
 * System.out.println(ex); }
 * 
 * }
 * 
 * 
 * }
 */