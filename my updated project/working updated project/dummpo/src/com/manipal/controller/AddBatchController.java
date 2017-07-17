package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.service.BatchService;
import com.manipal.service.impl.BatchServiceImpl;

/**
 * Servlet implementation class AddBatchController
 */
@WebServlet("/AddBatchController")
public class AddBatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBatchController() {
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

		int training_id= Integer.parseInt(request.getParameter("training_id"));
		String batch_name=request.getParameter("batch_name");
		String status = "Active";
		
		HttpSession session=request.getSession();

		BatchService crs=null;
		 int row=0;
		try {
			crs = new BatchServiceImpl();
			System.out.println("jjj");
		
			row = crs.addBatch(training_id, batch_name,status);
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
