package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Training;



public interface TrainingDAO {

	public Training ShowTraining(int m) throws ClassNotFoundException,SQLException, IOException;
	
	public List<Training> ViewTraining()throws ClassNotFoundException, SQLException, IOException;
	
	public void ChangeStatus(Training tt);
	
	public int DeleteTraining(int id,String status);
	
	public int updateTraining(Training tt);
	
	public int addTraining(Training training) throws ClassNotFoundException,SQLException,IOException;
}
