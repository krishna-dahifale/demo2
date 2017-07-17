package com.manipal.service.impl;

import com.manipal.DAO.LoginAdminDAO;
import com.manipal.DAO.jdbc.JdbcLoginAdminDAOImpl;
import com.manipal.service.LoginTraineeService;

public class LoginTraineeServiceImpl implements LoginTraineeService {
	private LoginAdminDAO lad;
	
	public LoginTraineeServiceImpl(LoginAdminDAO lad) {
		lad=new JdbcLoginAdminDAOImpl();
	}

	@Override
	public int loginValidate(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("in service Impl");
		return lad.loginValidate(username, password);
	}

}
