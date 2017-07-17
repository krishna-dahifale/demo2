package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.TraineeDAO;
import com.manipal.DAO.TrainingDAO;
import com.manipal.DAO.jdbc.JdbcTraineeDAOImpl;
import com.manipal.DAO.jdbc.JdbcTrainingDAOImpl;
import com.manipal.model.Trainee;
import com.manipal.service.TraineeService;
import com.manipal.service.TrainingService;

public class TraineeServiceImpl implements TraineeService{

	private TraineeDAO td;
	
	
	public TraineeServiceImpl() {
		td=new JdbcTraineeDAOImpl();
	}
	@Override
	public List<Trainee> viewTrainee() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return td.ViewTrainee();
	}

	@Override
	public Trainee showTrainee(int m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return td.ShowTrainee(m);
	}

	@Override
	public int deleteTrainee(int id, String status) {
		// TODO Auto-generated method stub
		return td.DeleteTrainee(id, status);
	}

	@Override
	public int UpdateTrainee(Trainee tt) {
		// TODO Auto-generated method stub
		return td.updateTrainee(tt);
	}
	@Override
	public int AddTrainee(int username, String password, String first_name,
			String last_name, String email_id, String dob, long contact_no,
			String h_qualification, String d_o_joining,
			String status) throws Exception {
		// TODO Auto-generated method stub
		
		Trainee trainee=new Trainee(username,password,first_name,last_name,email_id,dob,contact_no,h_qualification,d_o_joining,status);
		
		return td.insert(trainee);
	}

}
