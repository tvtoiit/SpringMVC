package CustomerSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import CustomerSystem.service.CustomerService;
import CustomerSystem.service.UserService;

@Controller
public class BaseController {
	@Autowired
	UserService _userService;
	
	@Autowired
	CustomerService customerService;
	public ModelAndView _mvShase = new ModelAndView();
}
