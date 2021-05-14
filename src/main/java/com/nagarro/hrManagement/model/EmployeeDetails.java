package com.nagarro.hrManagement.model;

public class EmployeeDetails {

	private String empCode;
	private String empName;
	private String empDob;
	private String empLocation;
	private String empEmail;
	
	
	
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDOB() {
		return empDob;
	}
	public void setEmpDOB(String empDOB) {
		this.empDob = empDOB;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetails [empCode=" + empCode + ", empName=" + empName + ", empDOB=" + empDob + ", empLocation="
				+ empLocation + ", empEmail=" + empEmail + "]";
	}
}
