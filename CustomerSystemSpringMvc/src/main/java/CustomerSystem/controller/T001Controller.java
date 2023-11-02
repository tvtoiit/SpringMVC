package CustomerSystem.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import CustomerSystem.Dto.UserDto;
import CustomerSystem.entity.Users;
import CustomerSystem.service.UserService;

@Controller
public class T001Controller extends BaseController {
	@Autowired
	UserService userServiceInstance;
	
	@RequestMapping(value = {"/user/T001"}, method = RequestMethod.GET)
	public ModelAndView login() {
		_mvShase.setViewName("/user/T001");
		_mvShase.addObject("userLogin", new UserDto());
		return _mvShase;
	}
	
	@RequestMapping(value = {"/user/T001"}, method = RequestMethod.POST)
	public ModelAndView handleLogin(@ModelAttribute("userLogin") UserDto userDto, HttpSession session) {
		List<Integer> loginSuccessful = userServiceInstance.checkLogin(userDto);
	    if (loginSuccessful.size() > 0){
	    	Users getUserInfo = userServiceInstance.getUserInfo(userDto);
	    	session.setAttribute("psncd", getUserInfo.getPsnCd());
	    	_mvShase.addObject("userLogin", userDto);
	    	_mvShase.setViewName("/user/T002");
	    	return _mvShase;
	    }else {
            ModelAndView modelAndView = new ModelAndView("/user/T001");
            modelAndView.addObject("userLogin", userDto);
            modelAndView.addObject("errorMessage", "Tên người dùng hoặc mật khẩu không chính xác.");
            return modelAndView;
        }
	}
}
