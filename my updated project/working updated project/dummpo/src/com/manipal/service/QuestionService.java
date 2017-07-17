package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Questions;


public interface QuestionService {
	public List<Questions> viewQuestions() throws ClassNotFoundException,SQLException,IOException;
	
	public Questions showQuestions(String m) throws ClassNotFoundException,SQLException,IOException;
	
	public int deleteQuestions(String id, String status);
	
	public void addQuestion(Questions que) throws ClassNotFoundException, IOException;
	
}
