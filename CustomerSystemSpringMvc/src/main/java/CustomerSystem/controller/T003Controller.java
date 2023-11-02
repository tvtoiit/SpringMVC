package CustomerSystem.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import CustomerSystem.Dto.CustomerDto;

@Controller
public class T003Controller extends BaseController {
	@RequestMapping(value = {"/user/T003"}, method = RequestMethod.GET)
	public ModelAndView getT003() {
		_mvShase.setViewName("/user/T003");
		_mvShase.addObject("customer", new CustomerDto());
		return _mvShase;
	}
	
	@RequestMapping(value = {"/T003"}, method = RequestMethod.POST)
	public ModelAndView handleT003(@ModelAttribute("customer") CustomerDto customerDto, HttpSession session) {
		BigDecimal psnCd = (BigDecimal)session.getAttribute("psncd");
		int customerSave = customerService.handleSave(customerDto, psnCd);
		if (customerSave > 0) {
			_mvShase.setViewName("/user/T002");
		} else {
			_mvShase.setViewName("/user/T003");
		}
		return _mvShase;
	}
}
