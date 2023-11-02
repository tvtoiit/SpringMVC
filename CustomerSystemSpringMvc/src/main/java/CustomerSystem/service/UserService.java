package CustomerSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CustomerSystem.Dto.UserDto;
import CustomerSystem.entity.Users;

@Service
public interface UserService {
	@Autowired
	public List<Integer> checkLogin(UserDto userDto);
	public Users getUserInfo(UserDto userDto);
}
