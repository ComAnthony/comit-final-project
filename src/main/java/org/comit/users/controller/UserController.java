package org.comit.users.controller;

import org.comit.users.bean.UserBean;
import org.comit.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping ("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping ("/enter") 
		public ModelAndView enter() {
			
		return new ModelAndView();
	}
	
	@GetMapping ("/hello")
		public String signUp() {
	
		return "hello";
	}
	
	@PostMapping ("/hello")
	public String createUser(HttpServletRequest req) {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String code = req.getParameter("code");
		
		UserBean user = this.createUserBean(username, password, code);
				
				this.userService.createUser(user);
		
		return "redirect/welcome";
	}
	

	@GetMapping ("/welcome") 
		public String madeCreate() {
		
		return "welcome";
	}
	
	@GetMapping ("/security")
		public String secureCreate() {
		
		return "security";
	}
	private UserBean createUserBean(String username, String password, String code) {
		
		return null;
	}
}
