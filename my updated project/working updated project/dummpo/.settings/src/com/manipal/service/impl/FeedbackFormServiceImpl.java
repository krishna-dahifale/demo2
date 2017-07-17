package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.FeedbackFormDAO;
import com.manipal.DAO.jdbc.JdbcFeedbackFormDAO;
import com.manipal.model.FeedbackForm;
import com.manipal.service.FeedbackFormService;

public class FeedbackFormServiceImpl implements FeedbackFormService{
	private FeedbackFormDAO ffd;
	
	public FeedbackFormServiceImpl() {
		ffd=new JdbcFeedbackFormDAO();
	}

	@Override
	public List<FeedbackForm> viewFeedbackForm() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return ffd.ViewFeedbackForm();
	}

	@Override
	public FeedbackForm showFeedbackForm(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return ffd.ShowFeedbackForm(m);
	}

	@Override
	public int deleteFeedbackForm(int id, String status) {
		// TODO Auto-generated method stub
		return ffd.DeleteFeedbackForm(id, status);
	}

	@Override
	public int UpdateFeedbackForm(FeedbackForm tt) {
		// TODO Auto-generated method stub
		return ffd.updateFeedbackForm(tt);
	}

	@Override
	public int generateFeedbackForm(FeedbackForm feedbackForm)
			throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		 return ffd.generateFeedback(feedbackForm);
		
	}

}
