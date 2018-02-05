package com.nt.service;

import com.nt.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}
	@Override
	public int fetchEmpCount() {
		//use DAO
		return dao.getEmpCount();
	}

}
