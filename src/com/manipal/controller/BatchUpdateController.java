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
import com.manipal.model.Training;
import com.manipal.service.BatchService;
import com.manipal.service.impl.BatchServiceImpl;
import com.manipal.service.impl.TrainingServiceImpl;

/**
 * Servlet implementation class BatchUpdateController
 */
@WebServlet("/BatchUpdateController")
public class BatchUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private BatchService bs; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException
    {
    	bs=new BatchServiceImpl();
    
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("A");
		int batch_id=Integer.parseInt(request.getParameter("batch_id"));
		int training_id=Integer.parseInt(request.getParameter("training_id"));
		String batch_name=request.getParameter("batch_name");
		//int no_of_trainee=Integer.parseInt(request.getParameter("no_of_trainee"));
		//String training_discription=request.getParameter("training_discription");
		
		Batch tt=new Batch(batch_id, training_id, batch_name, "status");
		

		int result =bs.UpdateBatch(tt);
		RequestDispatcher rd=request.getRequestDispatcher("batch.jsp");		
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
