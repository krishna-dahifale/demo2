package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.BatchDAO;

import com.manipal.model.Batch;



public class JdbcBatchDAOImpl implements BatchDAO{

	@Override
	public Batch ShowBatch(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		Batch t=null;
		Connection con=ConnectionHelper.getMySqlConnection();
		String sql="select * from batch where batch_id="+m;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			t= new Batch(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4));
			
		}
		return t;
	
	}

	@Override
	public List<Batch> ViewBatch() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		List<Batch> ls=new ArrayList<Batch>();
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select * from batch";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				Batch t= new Batch(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4));
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
	public int DeleteBatch(int id, String status) {
		// TODO Auto-generated method stub
		int res=0;
		String sql="update batch set status=? where batch_id=?";
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
	public int updateBatch(Batch tt) {
		// TODO Auto-generated method stub
		int result=0;
		try {
			String sql="UPDATE BATCH SET BATCH_ID=?,TRAINING_ID=?,BATCH_NAME=?,STATUS='active' WHERE BATCH_ID=?";
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement(sql);

			pst.setInt(1,tt.getBatch_id());
			pst.setInt(2,tt.getTraining_id());
			pst.setString(3,tt.getBatch_name());
			pst.setInt(4,tt.getBatch_id());
			
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
	public int addBatch(Batch batch) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		int cnt = 0;
		
		System.out.println("in jdbc connection");
	
		try {
			con = ConnectionHelper.getMySqlConnection();
			String query = "insert into batch values(BATCH_ID.NEXTVAL,?,?,'ACTIVE')";
			
			pst = con.prepareStatement(query);
			System.out.println("hhh");
			
			pst.setInt(1, batch.getTraining_id());
			pst.setString(2,batch.getBatch_name());
			
	
			cnt = pst.executeUpdate();
			System.out.println("after Commit");
	
		} catch (Exception e) {
			//System.out.println(e);
		} finally {
			ConnectionHelper.cleanup(con, pst, null);
		}
		System.out.println(cnt);
		return cnt;
	
	}

	

}
