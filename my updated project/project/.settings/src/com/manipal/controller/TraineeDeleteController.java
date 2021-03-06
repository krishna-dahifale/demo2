package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.service.BatchService;
import com.manipal.service.TraineeService;
import com.manipal.service.impl.BatchServiceImpl;
import com.manipal.service.impl.TraineeServiceImpl;

/**
 * Servlet implementation class TraineeDeleteController
 */
@WebServlet("/TraineeDeleteController")
public class TraineeDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TraineeService ts;
 /**
  * @see HttpServlet#HttpServlet()
  */
	public void init(ServletConfig config) throws ServletException{
		ts=new TraineeServiceImpl();
		System.out.println("z");
	}
    public TraineeDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("A");
		PrintWriter pst=response.getWriter();
		int id=Integer.parseInt(request.getParameter("trainee_id"));
		String status=request.getParameter("status");
		int result=0;
		response.setContentType("text/html");
		
		
		try{
			result=ts.deleteTrainee(id, status);
			HttpSession session = request.getSession();

			System.out.println("A");
			if(result==1){
				/*rd.forward(request, response);*/
				String message="Event Update Succssefully";
				session.setAttribute("Message",message );
			RequestDispatcher rd = request.getRequestDispatcher("/trainee.jsp");
			rd.forward(request, response);}
			else{
				/*rd.include(request, response);*/
				String message= "Something went wrong";
				session.setAttribute("Message",message);
				RequestDispatcher rd = request.getRequestDispatcher("/trainee.jsp");
				rd.forward(request, response);
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
