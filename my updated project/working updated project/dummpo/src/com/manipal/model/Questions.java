package com.manipal.model;

public class Questions {
	
	private String question_id;
	private int training_id;
	private String question;
	private String status;
	public Questions(String question_id, int training_id, String question,
			String status) {
		super();
		this.question_id = question_id;
		this.training_id = training_id;
		this.question = question;
		this.status = status;
	}
	public String getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}
	public int getTraining_id() {
		return training_id;
	}
	public void setTraining_id(int training_id) {
		this.training_id = training_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
