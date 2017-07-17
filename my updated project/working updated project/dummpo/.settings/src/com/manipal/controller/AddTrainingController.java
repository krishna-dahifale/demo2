package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Training;
import com.manipal.service.TrainingService;
import com.manipal.service.impl.TrainingServiceImpl;

/**
 * Servlet implementation class AddTraining
 */
@WebServlet("/AddTrainingController")
public class AddTrainingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTrainingController() {
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
		
		//int training_id=Integer.parseInt(request.getParameter("TRAINING_ID"));
		String training_name=request.getParameter("TRAINING_NAME");
		int training_duration=Integer.parseInt(request.getParameter("TRAINING_DURATION"));
		String training_discription=request.getParameter("TRAINING_DISCRIPTION");
		String status="ACTIVE";
		
		//System.out.println(training_id+" "+training_name+" "+training_duration+" "+training_discription+" "+status);
		
		Training training = new Training( training_name, training_duration, training_discription, status);
		int row=0;
		TrainingService atsi = new TrainingServiceImpl();
		try {
			row=atsi.addTraining(training);
		} catch (Exception e) {
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
