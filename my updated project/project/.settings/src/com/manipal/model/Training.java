package com.manipal.model;

public class Training {
	private int training_id;
	private String training_name;
	private int training_duration;
	private String discription;
	private String status;
	
	public Training(int training_id) {
		super();
		this.training_id = training_id;
	}
	
	public Training()
	{}
	
	public Training(String training_name,
			int training_duration, String discription, String status) {
		super();
		
		this.training_name = training_name;
		this.training_duration = training_duration;
		this.discription = discription;
		this.status = status;
	}

	public Training(int training_id, String training_name,
			int training_duration, String discription, String status) {
		super();
		this.training_id = training_id;
		this.training_name = training_name;
		this.training_duration = training_duration;
		this.discription = discription;
		this.status = status;
	}

	public int getTraining_id() {
		return training_id;
	}
	public void setTraining_id(int training_id) {
		this.training_id = training_id;
	}
	public String getTraining_name() {
		return training_name;
	}
	public void setTraining_name(String training_name) {
		this.training_name = training_name;
	}
	public int getTraining_duration() {
		return training_duration;
	}
	public void setTraining_duration(int training_duration) {
		this.training_duration = training_duration;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
