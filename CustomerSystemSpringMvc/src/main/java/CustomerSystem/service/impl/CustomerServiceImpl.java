package CustomerSystem.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CustomerSystem.Dto.CustomerDto;
import CustomerSystem.dao.T003Dao;
import CustomerSystem.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private T003Dao t003Dao = new T003Dao();
	
	@Override
	public int handleSave(CustomerDto customerDto, BigDecimal psncd) {
		return t003Dao.handleSave(customerDto, psncd);
	}

}
