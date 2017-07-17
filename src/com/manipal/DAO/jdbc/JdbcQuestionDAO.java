package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.QuestionDAO;
import com.manipal.model.Questions;
import com.manipal.model.Trainee;

public class JdbcQuestionDAO implements QuestionDAO{

	@Override
	public Questions ShowQuestion(String m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		Questions t=null;
		Connection con=ConnectionHelper.getMySqlConnection();
		String sql="select * from questions where question_id="+"'"+m+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			t= new Questions(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
			
		}
		return t;
	}

	@Override
	public List<Questions> ViewQuestion() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		List<Questions> ls=new ArrayList<Questions>();
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select * from questions";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				Questions t= new Questions(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
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
	public int DeleteQuestion(String id, String status) {
		// TODO Auto-generated method stub
		int res=0;
		String sql="update questions set status=? where question_id=?";
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement(sql);
			System.out.println("B");
			pst.setString(1, status);
			pst.setString(2, id);
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
	public String addQuestion(Questions que) throws ClassNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		int i=0;
		PreparedStatement ps=null;
		
		String str = "insert into QUESTIONS values (?,?,?,?)";
		System.out.println("IN DAOimpl after insert query");
		try
		{
			Connection con = ConnectionHelper.getMySqlConnection();
			
			ps=con.prepareStatement(str);
			ps.setString(1,que.getQuestion_id());
			ps.setInt(2,que.getTraining_id());
			ps.setString(3,que.getQuestion());
			ps.setString(4,que.getStatus());
			
			i= ps.executeUpdate();
			con.commit();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		if(i>0)
			return("FeedbackForm inserted successfully");
		else
			return("Feedback insertion failed");
}
	}

