package CustomerSystem.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import CustomerSystem.Dto.CustomerDto;

@Repository
public class T003Dao extends BaseDao {
	public int handleSave(CustomerDto customerDto, BigDecimal loggedInPsnCd) {
		String sql = "INSERT INTO MSTCUSTOMER (CUSTOMER_NAME, SEX, BIRTHDAY, EMAIL, ADDRESS, DELETE_YMD, INSERT_YMD, INSERT_PSN_CD, UPDATE_YMD, UPDATE_PSN_CD) " +
		             "VALUES (?, ?, ?, ?, ?, NULL, CURRENT_TIMESTAMP, ?, CURRENT_TIMESTAMP, ?)";
		int count = _jdbcTemplate.update(sql, customerDto.getCustomerName(), customerDto.getSex(), customerDto.getBirthDay(), customerDto.getEmail(), customerDto.getAddress(), loggedInPsnCd, loggedInPsnCd);	
		return count;
	}
}
