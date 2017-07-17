package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.FeedbackReport;
import com.manipal.model.Report;

public interface FeedbackReportDAO {
	public int insert(FeedbackReport freport);
	
	public int Validate(int feedback_id,int training_id);
	
	public List<Report> ViewFeedbackFormReport()throws ClassNotFoundException, SQLException, IOException;
}
