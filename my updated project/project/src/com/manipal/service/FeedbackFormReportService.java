package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.FeedbackReport;
import com.manipal.model.Report;

public interface FeedbackFormReportService{

	public int insert(int feedback_id, int trainee_id, String question_id, int rating );
	
	public int validate(int feedback_id,int training_id);
	
	public List<Report> viewFeedbackFormReport() throws ClassNotFoundException, SQLException,IOException;
	
}
