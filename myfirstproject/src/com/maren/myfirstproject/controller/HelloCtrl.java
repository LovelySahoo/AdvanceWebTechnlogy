//java package(lovely)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(lovely)
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloCtrl(lovely)
 */
@WebServlet("/HelloCtrl")
public class HelloCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(lovely)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// returns a printwriter object that can send character text to the client here it is hello servlet(lovely)
		response.getWriter().append("Hello Servlet ");
		
	}

}
