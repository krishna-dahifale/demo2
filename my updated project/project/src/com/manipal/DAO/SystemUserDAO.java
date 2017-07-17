package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.SystemUser;


public interface SystemUserDAO {

	public SystemUser ShowSystemUSer(int m) throws ClassNotFoundException,SQLException, IOException;
	
	public List<SystemUser> ViewSystemUser()throws ClassNotFoundException, SQLException, IOException;
	
	public int DeleteSystemUser(int id,String status);
	
	public int insert(SystemUser user);
}
