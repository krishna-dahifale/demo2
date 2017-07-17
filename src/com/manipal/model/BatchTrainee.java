package com.manipal.model;

public class BatchTrainee {
	
	private int training_id;
	private int batch_id;
	private int trainee_id;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	@Override
	public String toString() {
		return "BatchTrainee [training_id=" + training_id + ", batch_id="
				+ batch_id + ", trainee_id=" + trainee_id + "]";
	}
	
	
}
