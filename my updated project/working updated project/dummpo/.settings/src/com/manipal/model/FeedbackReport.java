package com.manipal.model;

public class FeedbackReport {
	
	private int feedback_id;
	private int trainee_id;
	private String question_id;
	private int rating;
	


	@Override
	public String toString() {
		return "FeedbackReport [feedback_id=" + feedback_id + ", trainee_id="
				+ trainee_id + ", question_id=" + question_id + ", rating="
				+ rating + "]";
	}

	public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}

	public int getTrainee_id() {
		return trainee_id;
	}

	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}

	public String getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

	
	
	
}
