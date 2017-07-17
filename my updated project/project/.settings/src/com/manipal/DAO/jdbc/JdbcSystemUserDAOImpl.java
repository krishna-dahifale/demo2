package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.SystemUserDAO;
import com.manipal.model.SystemUser;
import com.manipal.model.Trainee;

public class JdbcSystemUserDAOImpl implements SystemUserDAO{

	@Override
	public SystemUser ShowSystemUSer(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		SystemUser t=null;
		Connection con=ConnectionHelper.getMySqlConnection();
		String sql="select * from system_user where user_id="+m;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			t= new SystemUser(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(5),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getLong(9),rs.getString(10));
			
		}
		return t;
	}

	@Override
	public List<SystemUser> ViewSystemUser() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		List<SystemUser> ls=new ArrayList<SystemUser>();
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select * from system_user";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				SystemUser t=new SystemUser(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(5),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getLong(9),rs.getString(10));
				ls.add(t);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return ls;
	}

	@Override
	public int DeleteSystemUser(int id, String status) {
		// TODO Auto-generated method stub
		int res=0;
		String sql="update system_user set status=? where user_id=?";
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
	public int insert(SystemUser user) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		int cnt = 0;
		System.out.println(user);
		try {
			con =ConnectionHelper.getMySqlConnection();
			
			String query ="insert into system_user values(?,USER_ID.NEXTVAL,?,?,?,?,?,?,?,'ACTIVE')";
			
			 pst=con.prepareStatement(query);
			 
			 pst.setInt(1,user.getRole_id());
				
				pst.setInt(2,user.getUsername());
				pst.setString(3,user.getPassword());
				pst.setString(4,user.getFirst_name());
				pst.setString(5,user.getLast_name());
				pst.setString(6,user.getEmail_id());
				pst.setString(7,user.getDob());
				pst.setLong(8,user.getContact_no());
				//pst.setString(10, user.getStatus());
				
				cnt=pst.executeUpdate();
				
				con.commit();
			System.out.println("after commit");
				con.close();
			} catch (Exception e) {
				System.out.println(e);
				//LOGGER.error(e.getMessage());
			} finally {
				ConnectionHelper.cleanup(con, pst, null);
			}
			
			return cnt;
	}

}
