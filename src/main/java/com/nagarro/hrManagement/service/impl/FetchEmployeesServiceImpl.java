/*
 * package com.nagarro.hrManagement.service.impl;
 * 
 * import java.util.Arrays; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.client.RestClientException; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import com.nagarro.hrManagement.constant.Constant; import
 * com.nagarro.hrManagement.model.EmployeeDetails; import
 * com.nagarro.hrManagement.service.FetchEmployeesService;
 * 
 * @Service public class FetchEmployeesServiceImpl implements
 * FetchEmployeesService {
 * 
 * @Autowired private RestTemplate restTemplate;
 * 
 * @Override public List<EmployeeDetails> getAllEmployeeDetails() {
 * 
 * ResponseEntity<EmployeeDetails[]> response = null;
 * 
 * try { response =
 * restTemplate.getForEntity(Constant.REST_SERVICE_URI+"getEmployees",
 * EmployeeDetails[].class); } catch (RestClientException ex) {
 * 
 * System.out.println(ex); }
 * 
 * return Arrays.asList(response.getBody()); }
 * 
 * }
 */