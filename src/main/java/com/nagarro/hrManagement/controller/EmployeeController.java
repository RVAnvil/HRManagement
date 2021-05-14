package com.nagarro.hrManagement.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.hrManagement.constant.Constant;
import com.nagarro.hrManagement.model.EmployeeDetails;
import com.nagarro.hrManagement.service.EmployeeService;
import com.nagarro.hrManagement.viewResolver.ExcelUserListReportView;

@Controller
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeSerive;
	
	@Autowired
	private ExcelUserListReportView excelUserListReportView;

	@GetMapping(Constant.HOME_CONTROLLER_PATH)
	public String home(Model model, HttpSession session) {

		String userName = (String) session.getAttribute(Constant.HR_USER_NAME);
		if (userName == null)
			return Constant.LOGIN_JSP;

		List<EmployeeDetails> employeeList = employeeSerive.getAllEmployeeDetails();

		model.addAttribute(Constant.EMPLOYEE_LIST, employeeList);

		return Constant.HOME_JSP;
	}
	
	@GetMapping(value = Constant.EDIT_EMPL_CONTROLLER_PATH)
	public String editEmployeePageRedirect(Model model, @PathVariable(Constant.EMPLOYEE_CODE) String empCode,HttpSession session) {

		String userName = (String) session.getAttribute(Constant.HR_USER_NAME);
		if (userName == null)
			return Constant.LOGIN_JSP;

		model.addAttribute(Constant.EMPLOYEE_CODE, empCode);
		return Constant.EDIT_EMP_JSP;

	}
	
	@PostMapping(value = Constant.EDIT_DETAILS_CONTROLLER_PATH)
	public String editEmployee(EmployeeDetails empDetails, HttpSession session) {

		String userName = (String) session.getAttribute(Constant.HR_USER_NAME);
		if (userName == null)
			return Constant.LOGIN_JSP;

		employeeSerive.editEmployeeDetails(empDetails);
		return Constant.REDIRECT_HOME;

	}
	
	@GetMapping(value = Constant.UPLOAD_PATH)
    public String registerPage(HttpSession session){
		
		String userName = (String)session.getAttribute(Constant.HR_USER_NAME);
		if(userName == null)
			return Constant.LOGIN_JSP;
		
        return Constant.UPLOAD_JSP;     
    }
	
	@PostMapping(value = Constant.ADD_EMP_CONTROLLER_PATH)
	public String addEmployee(EmployeeDetails empDetails) {
		
		employeeSerive.addEmployeeDetails(empDetails);
		return Constant.REDIRECT_HOME;
		
	}
	
	@GetMapping(value = Constant.DOWNLOAD_CONTROLLER_PATH)
	public ModelAndView generateExcel() {
		List<EmployeeDetails> employeeList = employeeSerive.getAllEmployeeDetails();
		ModelAndView modelAndView = new ModelAndView(excelUserListReportView, Constant.EMPLOYEE_LIST, employeeList);
		return modelAndView;
			
	}

}
