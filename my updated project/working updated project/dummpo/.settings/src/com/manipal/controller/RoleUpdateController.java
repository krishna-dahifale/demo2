package com.manipal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Role;
import com.manipal.service.RoleService;
import com.manipal.service.impl.RoleServiceImpl;

/**
 * Servlet implementation class RoleUpdateController
 */
@WebServlet("/RoleUpdateController")
public class RoleUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public RoleService ts;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoleUpdateController() {
        super();
        // TODO Auto-generated constructor stub'
        
    }
    public void init(ServletConfig config) throws ServletException
    {
    	ts=new RoleServiceImpl();
    
    }
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int role_id=Integer.parseInt(request.getParameter("role_id"));
		String role_name=request.getParameter("role_name");
	
		
		Role tt=new Role(role_id, role_name,"active");
		

		int result = ts.UpdateRole(tt);
		RequestDispatcher rd=request.getRequestDispatcher("Role.jsp");		//redirect to proper page
		System.out.println("here");
		rd.include(request, response);
		if(result==1)
			System.out.println("update");
		else
			System.out.println("somthing went worng");
		
		
	}	
	}


	
