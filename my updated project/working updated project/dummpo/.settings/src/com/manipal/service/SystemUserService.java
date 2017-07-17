package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.SystemUser;


public interface SystemUserService {
	public List<SystemUser> viewSystemUser() throws ClassNotFoundException,SQLException,IOException;
	
	public SystemUser showSystemUser(int m) throws ClassNotFoundException,SQLException,IOException;
	
	public int deleteSystemUser(int id, String status);
	
	int AddUser(int role_id,int username,String password,String first_name,
			String last_name,String email_id,String dob,long contact_no,String status)throws Exception;
}
