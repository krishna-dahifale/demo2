package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.FeedbackForm;



public interface FeedbackFormService {


	public List<FeedbackForm> viewFeedbackForm() throws ClassNotFoundException,SQLException,IOException;
	
	public FeedbackForm showFeedbackForm(int m) throws ClassNotFoundException,SQLException,IOException;
	
	public int deleteFeedbackForm(int id, String status);
	
	public int UpdateFeedbackForm(FeedbackForm tt);
	
	public int generateFeedbackForm(FeedbackForm feedbackForm) throws ClassNotFoundException, IOException;
}
