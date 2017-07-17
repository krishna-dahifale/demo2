package com.manipal.model;

import java.util.Date;

public class FeedbackForm {
	
	private int feedback_id;
	private int training_id;
	private int batch_id;
	private String faculty_name;
	private String status;
	private String feedback_date;
	@Override
	public String toString() {
		return "FeedbackForm [feedback_id=" + feedback_id + ", training_id="
				+ training_id + ", batch_id=" + batch_id + ", faculty_name="
				+ faculty_name + ", status=" + status + ", feedback_date="
				+ feedback_date + "]";
	}
	public int getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}
	public FeedbackForm(int training_id, int batch_id,
			String faculty_name, String status, String feedback_date) {
		super();
		
		this.training_id = training_id;
		this.batch_id = batch_id;
		this.faculty_name = faculty_name;
		this.status = status;
		this.feedback_date = feedback_date;
	}

	
	public FeedbackForm(int feedback_id, int training_id, int batch_id,
			String faculty_name, String status, String feedback_date) {
		super();
		this.feedback_id = feedback_id;
		this.training_id = training_id;
		this.batch_id = batch_id;
		this.faculty_name = faculty_name;
		this.status = status;
		this.feedback_date = feedback_date;
	}
	public int getTraining_id() {
		return training_id;
	}
	public void setTraining_id(int training_id) {
		this.training_id = training_id;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFeedback_date() {
		return feedback_date;
	}
	public void setFeedback_date(String feedback_date) {
		this.feedback_date = feedback_date;
	}
	
	
	
	
	
	
	
	
}
