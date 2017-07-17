package com.manipal.service.impl;

import com.manipal.DAO.LoginAdminDAO;
import com.manipal.DAO.jdbc.JdbcLoginAdminDAOImpl;
import com.manipal.service.*;

public class LoginAdminServiceImpl implements LoginAdminService {
	LoginAdminDAO lad;
	public LoginAdminServiceImpl()
	{
		lad=new JdbcLoginAdminDAOImpl();
	}
	@Override
	public int loginValidate(String username, String password) {
		// TODO Auto-generated method stub
		return lad.loginValidate(username,password);
	}
	
	
	
}