package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.service.RoleService;
import com.manipal.service.impl.RoleServiceImpl;

/**
 * Servlet implementation class AddRoleController
 */
@WebServlet("/AddRoleController")
public class AddRoleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRoleController() {
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
		/*int role_id =Integer.parseInt(request.getParameter("roleid"));*/
		String role_type=request.getParameter("roletype");
		
		
		String Status=request.getParameter("Status");
			String status="ACTIVE";
			
			HttpSession session=request.getSession();
			
			RoleService ats=null;
			 int row=0;
				try {
					ats = new RoleServiceImpl();
						
					row = ats.AddRole(role_type,status);
					}
					
				 catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if(row==1)
				{
					response.sendRedirect("addrole.jsp");
				}
				else
				{
					//Redirection code to be added
				}
	}

}
