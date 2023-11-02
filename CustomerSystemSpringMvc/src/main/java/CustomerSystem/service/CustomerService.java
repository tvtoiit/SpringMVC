package CustomerSystem.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import CustomerSystem.Dto.CustomerDto;
@Service
public interface CustomerService {
	public int handleSave(CustomerDto customerDto, BigDecimal psncd);
}
