package com.manipal.model;

import java.util.Date;

public class Trainee {
	private int trainee_id;
	private int username;
	private String password;
	private String first_name;
	private String last_name;
	private String email_id;
	private String dob;
	private long contact_no;
	private String h_qualification;
	private String d_o_joining;
	//private String end_date;
	private String status;
	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getH_qualification() {
		return h_qualification;
	}
	public void setH_qualification(String h_qualification) {
		this.h_qualification = h_qualification;
	}
	public String getD_o_joining() {
		return d_o_joining;
	}
	public void setD_o_joining(String d_o_joining) {
		this.d_o_joining = d_o_joining;
	}
/*	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}*/
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Trainee(int trainee_id, int username, String password,
			String first_name, String last_name, String email_id, String dob,
			long contact_no, String h_qualification, String d_o_joining,
			String status) {
		super();
		this.trainee_id = trainee_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.dob = dob;
		this.contact_no = contact_no;
		this.h_qualification = h_qualification;
		this.d_o_joining = d_o_joining;
		//this.end_date = end_date;
		this.status = status;
	}
	/*public Trainee( int username, String password,
			String first_name, String last_name, String email_id, String dob,
			long contact_no, String h_qualification, String d_o_joining,String status) {
		super();
		
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.dob = dob;
		this.contact_no = contact_no;
		this.h_qualification = h_qualification;
		this.d_o_joining = d_o_joining;

		this.status = status;
	}
	public Trainee(int trainee_id) {
		super();
		this.trainee_id = trainee_id;
	}*/
	
	
	
	

}
