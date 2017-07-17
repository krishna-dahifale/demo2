package com.manipal.DAO.jdbc;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.RoleDAO;
import com.manipal.model.Role;

public class JdbcRoleDAOImpl implements RoleDAO{

	@Override
	public int insert(Role role) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		int cnt = 0;
		System.out.println("in dao impl");
		System.out.println(role);
try {
			con =ConnectionHelper.getMySqlConnection();
			String query ="insert into role values(ROLE_ID.NEXTVAL,?,'ACTIVE')";
			pst=con.prepareStatement(query);

			/*pst.setInt(1,role.getRole_id());*/
			pst.setString(1,role.getRole_type());
            cnt=pst.executeUpdate();
			
			con.commit();
		
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			//LOGGER.error(e.getMessage());
		} finally {
			ConnectionHelper.cleanup(con, pst, null);
		}
		
		return cnt;
	
	}

	@Override
	public Role ShowRole(int m) throws ClassNotFoundException, SQLException,
			IOException {
		// TODO Auto-generated method stub
		Role t=null;
		Connection con=ConnectionHelper.getMySqlConnection();
		String sql="select * from Role where Role_id="+m;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			t= new Role(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		return t;
	}

	@Override
	public List<Role> ViewRole() throws ClassNotFoundException, SQLException,
			IOException {
		// TODO Auto-generated method stub
		List<Role> ls=new ArrayList<Role>();
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select * from role";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				Role role= new Role(rs.getInt(1),rs.getString(2),rs.getString(3));
				ls.add(role);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ls;
	}

	@Override
	public void ChangeStatus(Role tt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteRole(int id, String status) {
		// TODO Auto-generated method stub
		int res=0;
		String sql="update role set status=? where role_id=?";
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement(sql);
			System.out.println("B");
			pst.setString(1, status);
			pst.setInt(2, id);
			res=pst.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return res;
		}
	}

	@Override
	public int updateRole(Role tt) {
		// TODO Auto-generated method stub
		int result=0;
		try {
			String sql="UPDATE Role SET ROLE_ID=?,ROLE_NAME=?,STATUS='active' WHERE role_id=?";
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement(sql);

			pst.setInt(1,tt.getRole_id());
			pst.setString(2,tt.getRole_type());
			pst.setInt(3,tt.getRole_id());
			
			result=pst.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
		return result;
		}
	}

}
