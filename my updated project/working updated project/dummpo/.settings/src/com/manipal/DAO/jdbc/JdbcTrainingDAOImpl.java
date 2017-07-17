package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.TrainingDAO;
import com.manipal.model.Training;

public class JdbcTrainingDAOImpl implements TrainingDAO {

	@Override
	public Training ShowTraining(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		
		Training t=null;
		Connection con=ConnectionHelper.getMySqlConnection();
		
		String sql="select * from training where training_id="+m;
		System.out.println("A");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			t= new Training(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
			
		}
		return t;
	}

	@Override
	public List<Training> ViewTraining() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		List<Training> ls=new ArrayList<Training>();
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select * from training";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				Training t= new Training(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
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
	public void ChangeStatus(Training tt) {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		try{
			System.out.println("In dao");
			Connection con=ConnectionHelper.getMySqlConnection();
			System.out.println("connected");
			String sql="update training set status='INACTIVE' where training_id=?";
			pst=con.prepareStatement(sql);
			pst.setLong(1, tt.getTraining_id());
			
			int row=pst.executeUpdate();
			System.out.println(row);
			
			if(row==1)
				System.out.println("success");
			
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public int DeleteTraining(int id, String status) {
		// TODO Auto-generated method stub
	int res=0;
	String sql="update training set status=? where training_id=?";
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
	public int updateTraining(Training tt) {
		// TODO Auto-generated method stub
		
		
		int result=0;
		try {
			String sql="UPDATE TRAINING SET TRAINING_ID=?,TRAINING_NAME=?,TRAINING_DURATION=?,TRAINING_DISCRIPTION=?,STATUS='active' WHERE training_id=?";
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement(sql);

			pst.setInt(1,tt.getTraining_id());
			pst.setString(2,tt.getTraining_name());
			pst.setInt(3,tt.getTraining_duration());
			pst.setString(4,tt.getDiscription());
			pst.setInt(5,tt.getTraining_id());
			
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
	public int addTraining(Training training) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		int cnt = 0;
		//Training training =train;
	
		try {
			con = ConnectionHelper.getMySqlConnection();
			String query = "insert into training values(TRAINING_ID.NEXTVAL,?,?,?,'ACTIVE')";
			//String sq = "desc candidate";
			//Statement stmt = con.createStatement();
			//System.out.println(stmt.execute(sq));
			//System.out.println(pst);
			pst = con.prepareStatement(query);
			System.out.println("hhh");
			/*System.out.println(pst);*/
			
			
			pst.setString(1, training.getTraining_name());
			pst.setInt(2,training.getTraining_duration());
			pst.setString(3, training.getDiscription());
			
		   cnt = pst.executeUpdate();
		   
			
			System.out.println(1);
			
		
			
		} catch (Exception e) {
			//System.out.println(e);
		} finally {
			ConnectionHelper.cleanup(con, pst, null);
		}
		System.out.println(cnt);
		return cnt;
	
	}
}


