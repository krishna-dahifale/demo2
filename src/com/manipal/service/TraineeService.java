package com.manipal.service;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Trainee;



public interface TraineeService {

	public List<Trainee> viewTrainee() throws ClassNotFoundException,SQLException,IOException;
	
	public Trainee showTrainee(int m) throws ClassNotFoundException,SQLException,IOException;
	
	public int deleteTrainee(int id, String status);
	
	public int UpdateTrainee(Trainee tt);
	
	int AddTrainee(int username,String password,String first_name,
			String last_name,String email_id,String dob,long contact_no,String h_qualification,String d_o_joining, String status) throws Exception;

}
