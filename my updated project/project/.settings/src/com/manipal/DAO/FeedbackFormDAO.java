package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.FeedbackForm;



public interface FeedbackFormDAO {
public FeedbackForm ShowFeedbackForm(int m) throws ClassNotFoundException,SQLException, IOException;
	
	public List<FeedbackForm> ViewFeedbackForm()throws ClassNotFoundException, SQLException, IOException;
	

	public int DeleteFeedbackForm(int id,String status);
	
	public int updateFeedbackForm(FeedbackForm tt);
	
	public int generateFeedback(FeedbackForm feedbackForm) throws ClassNotFoundException, IOException;
}
