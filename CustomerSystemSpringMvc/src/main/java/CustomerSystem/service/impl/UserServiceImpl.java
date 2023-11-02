package CustomerSystem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CustomerSystem.Dto.UserDto;
import CustomerSystem.dao.T001Dao;
import CustomerSystem.entity.Users;
import CustomerSystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private T001Dao t001Dao = new T001Dao();
	
	@Override
	public List<Integer> checkLogin(UserDto userDto) {
		List<Integer> list = new ArrayList<Integer>();
		list = t001Dao.checkLogin(userDto);
		return list;
	}

	@Override
	public Users getUserInfo(UserDto userDto) {
		return t001Dao.getUserInfo(userDto);
	}
}
