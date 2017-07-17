package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sun.misc.Cleaner;

import com.manipal.DAO.FeedbackReportDAO;
import com.manipal.model.FeedbackReport;
import com.manipal.model.Report;

public class JdbcFeedbackReportDAO implements FeedbackReportDAO {

	@Override
	public int insert(FeedbackReport freport) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement pst=null;
		int count=0;
		System.out.println(freport);
		try{
			con=ConnectionHelper.getMySqlConnection();
			System.out.println("In DAO");
			String query="insert into feedback_report values(?,?,?,?)";
			pst=con.prepareStatement(query);
			pst.setInt(1, freport.getFeedback_id());
			pst.setInt(2, freport.getTrainee_id());
			pst.setString(3,freport.getQuestion_id());
			pst.setInt(4,freport.getRating());
			System.out.println("DAO");
			
			count=pst.executeUpdate();
			System.out.println("count");
			con.commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			ConnectionHelper.cleanup(con, pst, null);
			
		}
		return count;
	}

	@Override
	public int Validate(int feedback_id, int training_id) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		int count=0;

		System.out.println(feedback_id);
		System.out.println(training_id);
		try {
			con = ConnectionHelper.getMySqlConnection();

			pst=con.prepareStatement("select count(*) from feedback_report where feedback_id=? and trainee_id=?");
			pst.setInt(1,feedback_id);
			pst.setInt(2, training_id);
			rs = pst.executeQuery();
			rs.next();
			count = rs.getInt(1);
			con.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
		
	}

	@Override
	public List<Report> ViewFeedbackFormReport()
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Report t;
		List<Report> ls=new ArrayList<Report>();
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select feedback_id , trainee_id , AVG(RATING) avg_rating FROM FEEDBACK_REPORT GROUP BY feedback_id,trainee_id";
			System.out.println(sql);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			System.out.println(rs);
			while(rs.next())
			{
				 t= new Report(rs.getInt("feedback_id"),rs.getInt("trainee_id"),rs.getFloat("avg_rating"));
				ls.add(t);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return ls;
	}

	//@Override
	//public List<FeedbackReport> ViewFeedbackFormReport()
			//throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		//List<FeedbackReport> ls=new ArrayList<FeedbackReport>();
		/*try{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql="select * from feedback_report";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				FeedbackReport t= new FeedbackReport(rs.getInt(1),rs.getInt(2),rs.getInt(4));
				ls.add(t);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
*/
	
}

	

