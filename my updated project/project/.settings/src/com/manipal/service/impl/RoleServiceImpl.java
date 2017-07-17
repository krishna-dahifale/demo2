package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.RoleDAO;
import com.manipal.DAO.jdbc.JdbcRoleDAOImpl;
import com.manipal.model.Role;
import com.manipal.service.RoleService;

public class RoleServiceImpl implements RoleService{
	RoleDAO rd;
	
	public RoleServiceImpl() {
		rd=new JdbcRoleDAOImpl();
		}

	@Override
	public int AddRole(String role_type, String status) throws Exception {
		// TODO Auto-generated method stub
		Role role=new Role(role_type,status);
		
		return rd.insert(role);
	}

	@Override
	public List<Role> ViewRole() throws ClassNotFoundException, SQLException,
			IOException {
		// TODO Auto-generated method stub
		return rd.ViewRole();
	}

	@Override
	public Role showRole(int m) throws ClassNotFoundException, SQLException,
			IOException {
		// TODO Auto-generated method stub
		return rd.ShowRole(m);
	}

	@Override
	public void changeStatus(Role tt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteRole(int id, String status) {
		// TODO Auto-generated method stub
		return rd.deleteRole(id, status);
	}

	@Override
	public int UpdateRole(Role tt) {
		// TODO Auto-generated method stub
		return rd.updateRole(tt);
	}

}
