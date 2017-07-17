package com.manipal.model;

public class Batch {
	
	private int batch_id;
	private int training_id;
	private String batch_name;
	private int no_of_trainee;
	private String status;
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public int getTraining_id() {
		return training_id;
	}
	public void setTraining_id(int training_id) {
		this.training_id = training_id;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public int getNo_of_trainee() {
		return no_of_trainee;
	}
	public void setNo_of_trainee(int no_of_trainee) {
		this.no_of_trainee = no_of_trainee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Batch(int batch_id, int training_id, String batch_name, String status) {
		super();
		this.batch_id = batch_id;
		this.training_id = training_id;
		this.batch_name = batch_name;
		this.status = status;
	}

	public Batch(int training_id, String batch_name, String status) {
		
		this.training_id = training_id;
		this.batch_name = batch_name;
		this.status = status;
	}
	
}
