package com.manipal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Training;
import com.manipal.service.TrainingService;
import com.manipal.service.impl.TrainingServiceImpl;

/**
 * Servlet implementation class TrainingUpdateController
 */
@WebServlet("/TrainingUpdateController")
public class TrainingUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public TrainingService ts;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainingUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException
    {
    	ts=new TrainingServiceImpl();
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("in controller");
		int training_id=Integer.parseInt(request.getParameter("training_id"));
		String training_name=request.getParameter("training_name");
		int training_duration=Integer.parseInt(request.getParameter("training_duration"));
		String training_discription=request.getParameter("training_discription");
		
		Training tt=new Training(training_id, training_name, training_duration, training_discription,"active");
		

		int result = ts.UpdateTraining(tt);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("training.jsp");		
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
