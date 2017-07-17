package com.manipal.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.service.LoginAdminService;
import com.manipal.service.LoginTraineeService;


/**
 * Servlet implementation class LoginController1
 */
@WebServlet("/LoginController")
public class LoginTraineeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginTraineeService loginservice; 
	/**
	 * Default constructor.
	 */
	public LoginTraineeController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		PrintWriter pw = response.getWriter();
		
		try {
			response.setContentType("text/html");
			String UserName = request.getParameter("username");
			String Password = request.getParameter("password");

			HttpSession session = request.getSession();
			session.setAttribute("username", UserName);
			session.setMaxInactiveInterval(1*60*60);
			
			
			if (UserName.equals("sonali") && Password.equals("sonali123")) {
				session.setAttribute("username", UserName);
				RequestDispatcher req = request.getRequestDispatcher("traineehome.jsp");
				req.forward(request, response);
			} else {
				if (loginservice.loginValidate(UserName, Password) == 1) {
					session.setAttribute("username", UserName);
					RequestDispatcher req = request.getRequestDispatcher("traineehome.jsp");
					req.forward(request, response);
				} else {
					session.setAttribute("username", null);
					RequestDispatcher req = request.getRequestDispatcher("/invalid.jsp");
					req.forward(request, response);
				}
			}
		} catch (Exception e) {
			RequestDispatcher req = request.getRequestDispatcher("/invalid.jsp");
			req.forward(request, response);
		}
}
}
