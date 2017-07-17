package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manipal.service.LoginTraineeService;

public class JdbcLoginTraineeDAOImpl implements LoginTraineeService {

	@Override
	public int loginValidate(String username, String password) {
		System.out.println("hi");
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			System.out.println("In DAO i");
			con = ConnectionHelper.getMySqlConnection();
			stmt = con.prepareStatement("select count(*) from trainee where username = ? and password= ?");
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
