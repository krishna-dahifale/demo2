package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.FeedbackReport;
import com.manipal.model.Questions;
import com.manipal.service.FeedbackFormReportService;
import com.manipal.service.QuestionService;
import com.manipal.service.impl.FeedbackFormReportServiceImpl;
import com.manipal.service.impl.QuestionServiceImpl;

/**
 * Servlet implementation class AddFeedbackController
 */
@WebServlet("/GenerateFeedbackReportController")
public class GenerateFeedbackReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateFeedbackReportController() {
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
		
		
		
		System.out.println("A controller");
QuestionService qs=new QuestionServiceImpl();
		
		FeedbackFormReportService ffrs=new FeedbackFormReportServiceImpl();
		
		int trainee_id=Integer.parseInt(request.getParameter("trainee_id"));
		
		int feedback_id=Integer.parseInt(request.getParameter("feedback_id"));
		int row=0;
		
		try {
			
			
			/*if (ffrs.validate(feedback_id, trainee_id) == 1) {
		
				System.out.println("error");
				
				
			}*/
			if (ffrs.validate(feedback_id, trainee_id) >= 1) {
				
				System.out.println("error");
			}
			else{
				List<Questions> que = qs.viewQuestions();
				for(Questions quest:que)
					{
					int rating=Integer.parseInt(request.getParameter(quest.getQuestion_id()));;
					System.out.println("B controller");
					row=ffrs.insert(feedback_id, trainee_id, quest.getQuestion_id(), rating);
					System.out.println("C controller");
					}
				
				}
					
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*finally{
			RequestDispatcher rd = request.getRequestDispatcher("operationsuccessful.jsp");
			rd.forward(request, response);
		}*/
		
		if(row==1)
		{
			response.sendRedirect("operationsuccessful.jsp");
		}
		else
		{
			response.sendRedirect("operationunsuccessful.jsp");
		}
		
	
	
		
	}

}
