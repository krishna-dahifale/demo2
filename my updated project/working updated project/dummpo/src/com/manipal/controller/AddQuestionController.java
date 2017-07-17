package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Questions;
import com.manipal.service.QuestionService;
import com.manipal.service.impl.QuestionServiceImpl;

/**
 * Servlet implementation class AddQuestionController
 */
@WebServlet("/AddQuestionController")
public class AddQuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddQuestionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String question_id=request.getParameter("question_id");
		int training_id=Integer.parseInt(request.getParameter("training_id"));
		String question=request.getParameter("question");	
		String status="ACTIVE";
		
		System.out.println(question_id+" "+training_id+" "+question+" "+status);
		
		Questions que = new Questions(question_id,training_id,question,status);
		QuestionService aqsi = new QuestionServiceImpl();
		try{
			aqsi.addQuestion(que);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
