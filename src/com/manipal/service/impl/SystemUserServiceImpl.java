package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.SystemUserDAO;
import com.manipal.DAO.TraineeDAO;
import com.manipal.DAO.jdbc.JdbcSystemUserDAOImpl;
import com.manipal.DAO.jdbc.JdbcTraineeDAOImpl;
import com.manipal.model.SystemUser;
import com.manipal.service.SystemUserService;

public class SystemUserServiceImpl implements SystemUserService {
	
private SystemUserDAO sud;


	
	
	public SystemUserServiceImpl() {
		sud=new JdbcSystemUserDAOImpl();
	}
	@Override
	public List<SystemUser> viewSystemUser() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return sud.ViewSystemUser();
	}

	@Override
	public SystemUser showSystemUser(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return sud.ShowSystemUSer(m);
	}
	@Override
	public int deleteSystemUser(int id, String status) {
		// TODO Auto-generated method stub
		return sud.DeleteSystemUser(id, status);
	}
	@Override
	public int AddUser(int role_id, int username, String password,
			String first_name, String last_name, String email_id, String dob,
			long contact_no, String status) throws Exception {
		// TODO Auto-generated method stub
			SystemUser user=new SystemUser(role_id,username,password,first_name,last_name,email_id,dob,contact_no,status);
		
			
			return sud.insert(user);
	}
	
	

}
