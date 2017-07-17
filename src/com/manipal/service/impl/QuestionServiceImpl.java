package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.QuestionDAO;
import com.manipal.DAO.jdbc.JdbcQuestionDAO;
import com.manipal.model.Questions;
import com.manipal.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {
	private QuestionDAO qd;
	
	public QuestionServiceImpl() {
		qd=new JdbcQuestionDAO();
	}

	@Override
	public List<Questions> viewQuestions() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return qd.ViewQuestion();
	}

	@Override
	public Questions showQuestions(String m) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return qd.ShowQuestion(m);
	}

	@Override
	public int deleteQuestions(String id, String status) {
		// TODO Auto-generated method stub
		return qd.DeleteQuestion(id, status);
	}

	@Override
	public void addQuestion(Questions que) throws ClassNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		qd.addQuestion(que);
		
	}

}
