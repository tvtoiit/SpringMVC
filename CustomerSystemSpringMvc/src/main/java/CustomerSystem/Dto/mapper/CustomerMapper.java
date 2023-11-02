package CustomerSystem.Dto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import CustomerSystem.Dto.CustomerDto;

public class CustomerMapper implements RowMapper<CustomerDto> {
	@Override
	public CustomerDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setCustomerId(rs.getLong("CUSTOMER_ID"));
		customerDto.setCustomerName(rs.getString("CUSTOMER_NAME"));
		customerDto.setSex(rs.getString("SEX"));
		customerDto.setBirthDay(rs.getString("BIRTHDAY"));
		customerDto.setEmail(rs.getString("EMAIL"));
		customerDto.setAddress(rs.getString("ADDRESS"));
		return customerDto;
	}

}
