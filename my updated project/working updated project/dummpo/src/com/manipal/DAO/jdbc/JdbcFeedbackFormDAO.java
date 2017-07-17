package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.FeedbackFormDAO;
import com.manipal.model.Batch;
import com.manipal.model.FeedbackForm;

public class JdbcFeedbackFormDAO implements FeedbackFormDAO{

	@Override
	public FeedbackForm ShowFeedbackForm(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		FeedbackForm t=null;
		Connection con=ConnectionHelper.getMySqlConnection();
		String sql="select * from feedback_form where feedback_id="+m;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			t= new FeedbackForm(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
			
		}
		return t;
	}

	@Override
	public List<FeedbackForm> ViewFeedbackForm() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		List<FeedbackForm> ls=new ArrayList<FeedbackForm>();
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select * from feedback_form";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				FeedbackForm t= new FeedbackForm(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
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
	public int DeleteFeedbackForm(int id, String status) {
		// TODO Auto-generated method stub
		int res=0;
		String sql="update feedback_form set status=? where feedback_id=?";
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement(sql);
			System.out.println("B");
			pst.setString(1, status);
			pst.setInt(2, id);
			res=pst.executeUpdate();
			System.out.println("update completed");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{	System.out.println(res);
			return res;
		}
	}

	@Override
	public int updateFeedbackForm(FeedbackForm tt) {
		// TODO Auto-generated method stub
		int result=0;
		try {
			String sql="UPDATE FEEDBACK_FORM SET FEEDBACK_ID=?,TRAINING_ID=?,BATCH_ID=?,FACULTY_NAME=?,STATUS='active' WHERE FEEDBACK_ID=?";
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement(sql);

			pst.setInt(1,tt.getFeedback_id());
			pst.setInt(2,tt.getTraining_id());
			pst.setInt(3,tt.getBatch_id());
			pst.setString(4,tt.getFaculty_name());
			pst.setInt(5,tt.getFeedback_id());
			
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
	public int generateFeedback(FeedbackForm feedbackForm)
			throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		int i=0;
		PreparedStatement ps=null;
		String str = "insert into FEEDBACK_FORM values (?,?,?,?,?,?)";
	
		try
		{
			Connection con = ConnectionHelper.getMySqlConnection();
			
			ps=con.prepareStatement(str);
			ps.setInt(1,feedbackForm.getFeedback_id());
			ps.setInt(2, feedbackForm.getTraining_id());
			ps.setInt(3, feedbackForm.getBatch_id());
			ps.setString(4, feedbackForm.getFaculty_name());
			ps.setString(5, feedbackForm.getFeedback_date());
			ps.setString(6, feedbackForm.getStatus());
			//System.out.println(ps);
			i= ps.executeUpdate();
			System.out.println("IN DAOimpl after insert query");
			
			System.out.println(i);
			con.commit();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	return i;
	}
	}

