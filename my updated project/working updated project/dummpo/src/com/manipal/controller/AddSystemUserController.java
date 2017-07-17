package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.service.SystemUserService;
import com.manipal.service.impl.SystemUserServiceImpl;

/**
 * Servlet implementation class AddSystemUserController
 */
@WebServlet("/AddSystemUserController")
public class AddSystemUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSystemUserController() {
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
		int role_id =Integer.parseInt(request.getParameter("roleid"));
		int username=Integer.parseInt(request.getParameter("username"));
		String password =request.getParameter("password");
		String first_name =request.getParameter("fname");
		String last_name =request.getParameter("lname");
		String email_id =request.getParameter("emailid");
		String dob =request.getParameter("dob");
		long contact_no =Long.parseLong(request.getParameter("contact_no"));
	
	String Status=request.getParameter("Status");
			String status="ACTIVE";
			
			HttpSession session=request.getSession();
			
			SystemUserService ats=null;
			 int row=0;
				try {
					ats = new SystemUserServiceImpl();
						
					row = ats.AddUser(role_id,username,password,first_name,last_name,email_id,dob,contact_no,status);
					}
					
				 catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
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
