package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.FeedbackForm;
import com.manipal.service.FeedbackFormService;
import com.manipal.service.impl.FeedbackFormServiceImpl;

/**
 * Servlet implementation class AddFeedbackFormController
 */
@WebServlet("/AddFeedbackFormController")
public class AddFeedbackFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFeedbackFormController() {
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
		
		//int feedback_id=Integer.parseInt(request.getParameter("feedback_id"));
		int training_id=Integer.parseInt(request.getParameter("training_id"));
		int batch_id=Integer.parseInt(request.getParameter("batch_id"));
		String faculty_name=request.getParameter("faculty_name");
		String feedback_date=request.getParameter("feedback_date");
		String status="ACTIVE";
		int row=0;
		//System.out.println(feedback_id+" "+training_id+" "+batch_id+" "+faculty_name+" "+feedback_date+" "+status);
		
		FeedbackForm fbf = new FeedbackForm(training_id, batch_id, faculty_name, feedback_date, status);
		
		FeedbackFormService gffi = new FeedbackFormServiceImpl();
		try {
			 row=gffi.generateFeedbackForm(fbf);
			if(row==1)
			{
				response.sendRedirect("operationsuccessful.jsp");
			}
			else
			{
				response.sendRedirect("operationunsuccessful.jsp");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
