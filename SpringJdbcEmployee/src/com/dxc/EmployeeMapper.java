package com.dxc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet r1, int num) throws SQLException {
		// TODO Auto-generated method stub
		return new Employee(r1.getString("name"),r1.getFloat("salary"), r1.getString("id"));
	}
	
}
