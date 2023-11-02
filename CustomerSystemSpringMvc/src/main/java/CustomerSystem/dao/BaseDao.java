package CustomerSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BaseDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
}
