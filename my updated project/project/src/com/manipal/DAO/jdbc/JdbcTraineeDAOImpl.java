package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


import com.manipal.DAO.TraineeDAO;
import com.manipal.model.Trainee;


public class JdbcTraineeDAOImpl implements TraineeDAO{

	@Override
	public Trainee ShowTrainee(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		Trainee t=null;
		Connection con=ConnectionHelper.getMySqlConnection();
		String sql="select * from trainee where trainee_id="+m;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			t= new Trainee(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getLong(8),rs.getString(9),rs.getString(10),rs.getString(11));
			
		}
		return t;
	}

	@Override
	public List<Trainee> ViewTrainee() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		
		List<Trainee> ls=new ArrayList<Trainee>();
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select * from trainee";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				Trainee t=new Trainee(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getLong(8),rs.getString(9),rs.getString(10),rs.getString(11));
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
	public int DeleteTrainee(int id, String status) {
		// TODO Auto-generated method stub
		int res=0;
		String sql="update trainee set status=? where trainee_id=?";
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
	public int updateTrainee(Trainee tt) {
		// TODO Auto-generated method stub
		int result=0;
		try {
			String sql="UPDATE TRAINEE SET TRAINEE_ID=?,USERNAME=?,PASSWORD=?,FIRST_NAME=?,LAST_NAME=?,EMAIL_ID=?,DOB=?,CONTACT_NO=?,H_QUALIFICATION=?,D_O_JOINING=?,STATUS='STATUS' WHERE TRAINEE_ID=?";
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement(sql);

			pst.setInt(1,tt.getTrainee_id());
			pst.setInt(2,tt.getUsername());
			pst.setString(3,tt.getPassword());
			pst.setString(4,tt.getFirst_name());
			pst.setString(5,tt.getLast_name());
			pst.setString(6,tt.getEmail_id());
			pst.setString(7,tt.getDob());
			pst.setLong(8,tt.getContact_no());
			pst.setString(9,tt.getH_qualification());
			pst.setString(10,tt.getD_o_joining());
			//pst.setString(11,tt.getEnd_date());
			pst.setInt(11,tt.getTrainee_id());


			
			result=pst.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
		return result;
		}
	}

	@Override
	public int insert(Trainee trainee) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		int cnt = 0;
		System.out.println(trainee);
		try {
			
		     con =ConnectionHelper.getMySqlConnection();
		
			String query ="insert into trainee(trainee_id,username,password,first_name,last_name,email_id,dob,contact_no,h_qualification,d_o_joining,status) values(?,?,?,?,?,?,?,?,?,?,'ACTIVE')";
		
			pst=con.prepareStatement(query);

		    pst.setInt(1,trainee.getTrainee_id());
			pst.setInt(2,trainee.getUsername());
			pst.setString(3,trainee.getPassword());
			pst.setString(4,trainee.getFirst_name());
			pst.setString(5,trainee.getLast_name());
			pst.setString(6,trainee.getEmail_id());
			pst.setString(7,trainee.getDob());
			pst.setLong(8,trainee.getContact_no());
			pst.setString(9,trainee.getH_qualification());
		    pst.setString(10,trainee.getD_o_joining());
			//pst.setString(10,trainee.getEnd_date());
		//	System.out.println(2);
			cnt=pst.executeUpdate();
			System.out.println(con);
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

}
