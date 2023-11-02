package CustomerSystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import CustomerSystem.Dto.UserDto;
import CustomerSystem.Dto.mapper.CntUserMapper;
import CustomerSystem.entity.Users;
import CustomerSystem.entity.mapper.UserMapper;

@Repository
public class T001Dao extends BaseDao{
	public List<Integer> checkLogin(UserDto userDto) {
		String sql = "SELECT COUNT(*) AS CNT FROM MSTUSER WHERE DELETE_YMD IS NULL AND USERID = ? AND PASSWORD = ?";
		List<Integer> list = _jdbcTemplate.query(sql, new CntUserMapper(), userDto.getUserName(), userDto.getPassWord());
		return list;
	}
	
	public Users getUserInfo(UserDto userDto) {
	    String query = "SELECT * FROM MSTUSER WHERE DELETE_YMD IS NULL AND USERID = ? AND PASSWORD = ?";
	    Users results = _jdbcTemplate.queryForObject(query, new UserMapper(), userDto.getUserName(), userDto.getPassWord());
		return results;
	}
}
