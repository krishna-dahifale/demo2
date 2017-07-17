package com.manipal.service;

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Training;

public interface TrainingService {

	
	public List<Training> viewTrainee() throws ClassNotFoundException,SQLException,IOException;
	
	public Training showTrainee(int m) throws ClassNotFoundException,SQLException,IOException;
	
	public void changeStatus(Training tt);
	
	public int deleteTraining(int id, String status);
	
	public int UpdateTraining(Training tt);
	
	public int addTraining(Training tt);
	
	public int addTraining(String training_name,int training_duration,String discription) throws ClassNotFoundException,SQLException,IOException;

}
