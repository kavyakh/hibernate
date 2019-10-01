package com.zensar.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.Services.UserServiceImpl;
import com.zensar.Services.UserServices;
import com.zensar.daos.UserDao;
import com.zensar.daos.UserDaoImpl;
import com.zensar.entities.User;
import com.zensar.exception.ServiceException;
/**
 *@author Kavya KH
 *@version 2.0
 *@creation_date 21st sep 2019 5.38PM
 *@modification_date 28rd sep 2019 11:52AM
 *@copyright Zensar Technologies.All rights reserved.
 *@description It is Data Access object Interface Implementor class.
 *             It is used in Persistence layer of Application.        
 */


/**
 * Servlet implementation class LoginController
 */
@WebServlet("/checkuser")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// call Business Layer Component
		private UserServices userService;
		
		public void setUserService(UserServices userService) {
			this.userService = userService;
		}

		@Override
		public void init() throws ServletException {
			// TODO Auto-generated method stub
			UserDao userDao = new UserDaoImpl();
			UserServices userservice = new UserServiceImpl();
			((UserServiceImpl) userservice).setUserDao(userDao);
			setUserService(userService);
			
			
		}
		
		
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();
			
			String username =request.getParameter("username");
			String password =request.getParameter("passwd");
			
			User clientUser = new User();
			clientUser.setUsername(username);
			clientUser.setPassword(password);
			
			try {
				if(userService.validateUser(clientUser)) {
					//out.println("<p> Dear "+ username + " welcome to online shopping</p>");
					RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
					rd.forward(request, response);
					
				}
				else {
					out.println("<p>Sorry! Invalid Credential</p>");
					RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
					rd.include(request, response);
					
				}
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}


}
