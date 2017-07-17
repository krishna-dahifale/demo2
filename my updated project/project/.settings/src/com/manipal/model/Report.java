package com.manipal.model;

public class Report {

	private int feedback_id;
	private int trainee_id;
	private float avg_rating;
	@Override
	public String toString() {
		return "Report [feedback_id=" + feedback_id + ", trainee_id="
				+ trainee_id + ", avg_rating=" + avg_rating + "]";
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
	public float getAvg_rating() {
		return avg_rating;
	}
	public void setAvg_rating(float avg_rating) {
		this.avg_rating = avg_rating;
	}
	public Report(int feedback_id, int trainee_id, float avg_rating) {
		super();
		this.feedback_id = feedback_id;
		this.trainee_id = trainee_id;
		this.avg_rating = avg_rating;
	}
	
}
