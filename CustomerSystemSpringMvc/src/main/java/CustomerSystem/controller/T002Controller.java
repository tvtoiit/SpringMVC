package CustomerSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import CustomerSystem.Dto.CustomerDto;

@Controller
public class T002Controller extends BaseController {
	@RequestMapping(value = {"/T003"}, method = RequestMethod.GET)
	public ModelAndView getT003() {
		_mvShase.setViewName("/user/T003");
		_mvShase.addObject("customer", new CustomerDto());
		return _mvShase;
	}
}
