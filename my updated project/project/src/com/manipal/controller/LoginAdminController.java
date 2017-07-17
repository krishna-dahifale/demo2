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

import com.manipal.service.LoginAdminService;
import com.manipal.service.impl.LoginAdminServiceImpl;

/**
 * Servlet implementation class LoginAdminController
 */
@WebServlet("/LoginAdminController")
public class LoginAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginAdminService las;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdminController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		las = new LoginAdminServiceImpl();
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		
		try {
			response.setContentType("text/html");
			String UserName = request.getParameter("username");
			String Password = request.getParameter("password");

			HttpSession session = request.getSession();
			session.setAttribute("username", UserName);
			session.setMaxInactiveInterval(1*60*60);

			if (UserName.equals("admin") && Password.equals("admin")) {
				session.setAttribute("username", UserName);
				RequestDispatcher req = request.getRequestDispatcher("/adminhome.jsp");
				req.forward(request, response);
			} else {
				if (las.loginValidate(UserName, Password) == 1) {
					session.setAttribute("username", UserName);
					RequestDispatcher req = request.getRequestDispatcher("/adminhome.jsp");
					req.forward(request, response);
				} else {
					session.setAttribute("username", "");
					RequestDispatcher req = request.getRequestDispatcher("/invalid.jsp");
					req.forward(request, response);
					
				}
			}
		} catch (Exception e) {
			RequestDispatcher req = request.getRequestDispatcher("/home.jsp");
			req.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
