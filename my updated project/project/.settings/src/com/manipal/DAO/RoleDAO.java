package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Role;

public interface RoleDAO {
	public int insert(Role role);
	
	public Role ShowRole(int m)throws ClassNotFoundException,SQLException, IOException;
	
	public List<Role> ViewRole()throws ClassNotFoundException, SQLException, IOException;

	 void ChangeStatus(Role tt);
	
	public int deleteRole(int id,String status);
	
	public int updateRole(Role tt);
}
