package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Role;

public interface RoleService {
	int AddRole(String role_type,String status)throws Exception;
	
	public List<Role> ViewRole()throws ClassNotFoundException, SQLException, IOException;

	public Role showRole(int m) throws ClassNotFoundException,SQLException,IOException;

	
	public void changeStatus(Role tt);
	
	public int deleteRole(int id, String status);
	
	public int UpdateRole(Role tt);
}
