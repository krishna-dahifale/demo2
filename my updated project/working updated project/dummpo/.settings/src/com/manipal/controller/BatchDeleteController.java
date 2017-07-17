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
import com.manipal.service.impl.BatchServiceImpl;
import com.manipal.service.impl.TrainingServiceImpl;

/**
 * Servlet implementation class BatchDeleteController
 */
@WebServlet("/BatchDeleteController")
public class BatchDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public BatchService bs;
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init(ServletConfig config) throws ServletException{
		bs=new BatchServiceImpl();
		System.out.println("z");
	}
    public BatchDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pst=response.getWriter();
		int id=Integer.parseInt(request.getParameter("batch_id"));
		String status=request.getParameter("status");
		int result=0;
		response.setContentType("text/html");
		
		
		try{
			result=bs.deleteBatch(id, status);
			HttpSession session = request.getSession();

			System.out.println("A");
			if(result==1){
				/*rd.forward(request, response);*/
				String message="Event Update Succssefully";
				session.setAttribute("Message",message );
			RequestDispatcher rd = request.getRequestDispatcher("/batch.jsp");
			rd.forward(request, response);}
			else{
				/*rd.include(request, response);*/
				String message= "Something went wrong";
				session.setAttribute("Message",message);
				RequestDispatcher rd = request.getRequestDispatcher("/batch.jsp");
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
