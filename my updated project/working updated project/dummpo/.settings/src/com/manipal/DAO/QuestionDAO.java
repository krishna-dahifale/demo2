package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Questions;
import com.manipal.model.Trainee;

public interface QuestionDAO {
	public Questions ShowQuestion(String m) throws ClassNotFoundException,SQLException, IOException;
	
	public List<Questions> ViewQuestion()throws ClassNotFoundException, SQLException, IOException;
	
	public int DeleteQuestion(String id,String status);
	
	public String addQuestion(Questions que) throws ClassNotFoundException, IOException;
}
