package com.nt.dao;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_COUNT="SELECT COUNT(*)FROM EMP";
	private JdbcTemplate jt;	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	
	@Override
	public int getEmpCount() {
		int count=0;
		//execute Query
		count=jt.queryForObject(GET_EMP_COUNT,new Object[]{},Integer.class);
	return count;
		
	}
	
}
