package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;










import com.manipal.DAO.FeedbackReportDAO;
import com.manipal.DAO.jdbc.JdbcFeedbackReportDAO;
import com.manipal.model.FeedbackReport;
import com.manipal.model.Report;
import com.manipal.service.FeedbackFormReportService;
import com.manipal.service.FeedbackFormService;

public class FeedbackFormReportServiceImpl implements FeedbackFormReportService{
	
	private FeedbackReportDAO frd;
	

	public FeedbackFormReportServiceImpl() {
		frd=new JdbcFeedbackReportDAO();
	}


	@Override
	public int insert(int feedback_id, int trainee_id, String question_id,
			int rating) {
		// TODO Auto-generated method stub
		FeedbackReport fr=new FeedbackReport();
		fr.setFeedback_id(feedback_id);
		fr.setTrainee_id(trainee_id);
		fr.setQuestion_id(question_id);
		fr.setRating(rating);
		
		return frd.insert(fr);
	
	}
	
	@Override
	public int validate(int feedback_id, int training_id) {
		// TODO Auto-generated method stub
		return frd.Validate(feedback_id,training_id);
	}


	@Override
	public List<Report> viewFeedbackFormReport()
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		List<Report> list = null;
		FeedbackReportDAO feedBack = new JdbcFeedbackReportDAO();
		list = feedBack.ViewFeedbackFormReport();
		return list;
	}



	
	
	
	
	
	

}
