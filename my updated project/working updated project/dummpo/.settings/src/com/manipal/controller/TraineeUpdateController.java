package com.manipal.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Trainee;
import com.manipal.model.Training;
import com.manipal.service.TraineeService;
import com.manipal.service.impl.TraineeServiceImpl;
import com.manipal.service.impl.TrainingServiceImpl;

/**
 * Servlet implementation class TraineeUpdateController
 */
@WebServlet("/TraineeUpdateController")
public class TraineeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public TraineeService ts;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraineeUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException
    {
    	ts=new TraineeServiceImpl();
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*Calendar calendar=Calendar.getInstance();
		Date dob=new Date(calendar.getTime().getTime());*/
		
		//SimpleDateFormat sdf1=new SimpleDateFormat("YYYY-MM-dd");
		int trainee_id=Integer.parseInt(request.getParameter("trainee_id"));
		int username=Integer.parseInt(request.getParameter("username"));
		String password=request.getParameter("password");
		String first_name=request.getParameter("first_name");
		String last_name=request.getParameter("last_name");
		String email_id=request.getParameter("email_id");
		String dob=request.getParameter("dob");
		long contact_no=Long.parseLong(request.getParameter("contact_no"));
		String h_qualification=request.getParameter("h_qualification");
		String d_o_joining= request.getParameter("d_o_joining");
		String end_date=request.getParameter("end_date");
		
		Trainee tt=new Trainee(trainee_id, username, password, first_name, last_name, email_id, dob, contact_no, h_qualification, d_o_joining, end_date, "status");

		int result = ts.UpdateTrainee(tt);
		RequestDispatcher rd=request.getRequestDispatcher("trainee.jsp");	
		
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
