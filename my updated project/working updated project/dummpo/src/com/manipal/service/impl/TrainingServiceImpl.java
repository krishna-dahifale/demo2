package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.TrainingDAO;
import com.manipal.DAO.jdbc.JdbcTrainingDAOImpl;
import com.manipal.model.Training;
import com.manipal.service.TrainingService;

public class TrainingServiceImpl implements TrainingService{

	private TrainingDAO td;
	
	
	public TrainingServiceImpl() {
		td=new JdbcTrainingDAOImpl();
	}

	@Override
	public List<Training> viewTrainee() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return td.ViewTraining();
	}

	@Override
	public Training showTrainee(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return td.ShowTraining(m);
	}

	@Override
	public void changeStatus(Training tt) {
		// TODO Auto-generated method stub
		td.ChangeStatus(tt);
	}

	

	@Override
	public int UpdateTraining(Training tt) {
		// TODO Auto-generated method stub
		return td.updateTraining(tt);
	}

	@Override
	public int deleteTraining(int id, String status) {
		// TODO Auto-generated method stub
		return td.DeleteTraining(id, status);
	}

	@Override
	public int addTraining(Training tt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addTraining(String training_name, int training_duration,
			String discription) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Training training = new Training() ;

		training.setTraining_name(training_name);
		training.setTraining_duration(training_duration);
		training.setDiscription(discription);
		
		
		return td.addTraining(training);
	}

}
