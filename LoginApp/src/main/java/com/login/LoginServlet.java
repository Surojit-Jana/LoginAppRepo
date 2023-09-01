package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static String userName;
	static String password;

	public LoginServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Update 1");
		System.out.println("Update 2");
		// general settings
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();

		// get request data
		userName = request.getParameter("username");
		password = request.getParameter("password");

		/*
		 * if (userName.equalsIgnoreCase("suro") && password.equals("manager")) {
		 * printWriter.println("Login successful " + userName); //
		 * } else if(password.isEmpty()){
		 * response.sendError(404, "Enter password"); 
		 * } else { response.sendError(405,
		 * "Login failed, try with valid credentials"); 
		 * }
		 */
		
		/*
		 * if (userName.equalsIgnoreCase("suro") && password.equals("manager")) {
		 * response.sendRedirect("https://www.youtube.com/"); //will redirect to the url if username & password are correct. 
		 * } else if(password.isEmpty()){
		 * response.sendError(404, "Enter password"); 
		 * } else { response.sendError(405,
		 * "Login failed, try with valid credentials"); 
		 * }
		 */
		
		/*
		RequestDispatcher dispatcher;
		if (userName.equalsIgnoreCase("suro") && password.equals("manager")) {
			dispatcher = request.getRequestDispatcher("success.html");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("fail.html");
			dispatcher.forward(request, response);
		}
		*/

		/*
		 * if(userName.equalsIgnoreCase("suro") && password.equals("manager")) {
		 * printWriter.println("<a href='http://www.facebook.com'>Click to redirect to Facebook</a>"); 
		 * } else { printWriter.println("Login failed!<br>"); 
		 * printWriter.println("<a href='http://localhost:9999/LoginApp/FailServlet'>Click to learn more</a>"); 
		 * }
		 */
		
		RequestDispatcher dispatcher;
		if(userName.equalsIgnoreCase("suro") && password.equals("manager")) {
			dispatcher = request.getRequestDispatcher("success.html");
			dispatcher.forward(request, response);
		} else {
			printWriter.println("Incorrect details entered!");
			dispatcher = request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);

			// used include method so if details are incorrect, it'll print the msg as well
			// as display the from again on the same page.
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
