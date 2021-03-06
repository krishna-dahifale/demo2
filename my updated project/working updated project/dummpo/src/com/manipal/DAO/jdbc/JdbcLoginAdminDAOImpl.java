package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manipal.DAO.LoginAdminDAO;


public class JdbcLoginAdminDAOImpl implements LoginAdminDAO {

	@Override
	public int loginValidate(String username, String password) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		try 	{
			con = ConnectionHelper.getMySqlConnection();
		stmt = con.prepareStatement("select count(*) from SYSTEM_USER where USERNAME = ? and PASSWORD = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			result = stmt.executeQuery();
			
			result.next();
			int count = result.getInt(1);
			System.out.println(count);
			con.close();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionHelper.cleanup(con, stmt, result);
		}
		return 0;
	}

	

	


}
