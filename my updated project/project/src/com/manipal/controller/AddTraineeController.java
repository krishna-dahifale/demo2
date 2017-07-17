package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.service.TraineeService;
import com.manipal.service.TrainingService;
import com.manipal.service.impl.TraineeServiceImpl;

/**
 * Servlet implementation class AddTraineeServlet
 */
@WebServlet("/AddTraineeController")
public class AddTraineeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTraineeController(){
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
		System.out.println("in controller");
		int trainee_id=Integer.parseInt(request.getParameter("tid"));
		int username=Integer.parseInt(request.getParameter("username"));
		String password =request.getParameter("password");
		String first_name =request.getParameter("first_name");
		String last_name =request.getParameter("last_name");
		String email_id =request.getParameter("email_id");
		String dob =request.getParameter("dob");
		long contact_no =Long.parseLong(request.getParameter("contact_no"));
		String h_qualification =request.getParameter("h_qualification");
		String d_o_joining =request.getParameter("doj");
		
		//String status="ACTIVE";
		
		System.out.println("gg");
		HttpSession session=request.getSession();
		
		TraineeService ats=null;
		 int row=0;
			try {
				ats = new TraineeServiceImpl();
				
					
				row = ats.AddTrainee(trainee_id,username,password,first_name,last_name,email_id,dob,contact_no,h_qualification,d_o_joining,"active");
				}
				
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
