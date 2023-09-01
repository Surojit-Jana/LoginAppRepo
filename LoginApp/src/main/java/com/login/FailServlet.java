package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FailServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		if (!LoginServlet.userName.equalsIgnoreCase("suro") && !LoginServlet.password.equals("manager")) {
			response.getWriter().println("Username & Password incorrect");
		} else if (!LoginServlet.password.equals("manager")) {
			response.getWriter().println("Password incorrect");
		} else if (!LoginServlet.userName.equalsIgnoreCase("suro")) {
			response.getWriter().println("Username incorrect");
		}
	}

}
