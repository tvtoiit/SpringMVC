package CustomerSystem.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import CustomerSystem.entity.Users;

public class UserMapper implements RowMapper<Users> {
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users user = new Users();
		user.setPsnCd(rs.getBigDecimal("PSN_CD"));
		user.setUserId(rs.getString("USERID"));
		user.setPassWord(rs.getString("PASSWORD"));
		user.setUserName(rs.getString("USERNAME"));
		return user;
	}

}
