package com.nagarro.hrManagement.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nagarro.hrManagement.constant.Constant;
import com.nagarro.hrManagement.model.UserLoginInfo;

@Controller
@RequestMapping("/")
public class HRController {

	@RequestMapping("/")
	public String startWebApp() {
		return Constant.LOGIN_JSP;
	}
	
	@PostMapping(Constant.PROCESS_LOGIN)
	public String login(UserLoginInfo userInfo,Model model,RedirectAttributes redirectAttributes,HttpSession session) {

		if (userInfo.getUserName().equals(Constant.USER_NAME) && 
				userInfo.getPassword().equals(Constant.PASSWORD)) {
			session.setAttribute("userName", userInfo.getUserName());
			
			return  Constant.REDIRECT_HOME;
		} else
			return Constant.LOGIN_JSP;

	}
	
	@GetMapping(Constant.LOGOUT_CONTROLLER_PATH)
	public String logoutUser(HttpSession session) {
		
		session.invalidate();
		return Constant.LOGIN_JSP;
		
	}
	
}
