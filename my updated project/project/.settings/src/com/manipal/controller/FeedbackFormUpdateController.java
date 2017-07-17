package com.manipal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Batch;
import com.manipal.model.FeedbackForm;
import com.manipal.service.FeedbackFormService;
import com.manipal.service.impl.BatchServiceImpl;
import com.manipal.service.impl.FeedbackFormServiceImpl;

/**
 * Servlet implementation class FeedbackFormUpdate
 */
@WebServlet("/FeedbackFormUpdate")
public class FeedbackFormUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public FeedbackFormService ffs;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackFormUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException
    {
    	ffs=new FeedbackFormServiceImpl();
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("A");
		int feedback_id=Integer.parseInt(request.getParameter("feedback_id"));
		int training_id=Integer.parseInt(request.getParameter("training_id"));
		int batch_id=Integer.parseInt(request.getParameter("batch_id"));

		String faculty_name=request.getParameter("faculty_name");
		String feedback_date=request.getParameter("feedback_date");
		//String training_discription=request.getParameter("training_discription");
		
		FeedbackForm tt=new FeedbackForm(feedback_id, training_id, batch_id, faculty_name, "status",feedback_date);
		

		int result =ffs.UpdateFeedbackForm(tt);
		RequestDispatcher rd=request.getRequestDispatcher("feedbackForm.jsp");		
		rd.include(request, response);
		if(result==1)
			System.out.println("update");
		else
			System.out.println("somthing went worng");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
