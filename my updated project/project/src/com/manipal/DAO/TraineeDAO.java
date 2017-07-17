package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Trainee;
import com.manipal.model.Training;

public interface TraineeDAO {
	public Trainee ShowTrainee(int m) throws ClassNotFoundException,SQLException, IOException;
	
	public List<Trainee> ViewTrainee()throws ClassNotFoundException, SQLException, IOException;
	
	public int DeleteTrainee(int id,String status);
	
	public int updateTrainee(Trainee tt);
	
	public int insert(Trainee trainee);
}
