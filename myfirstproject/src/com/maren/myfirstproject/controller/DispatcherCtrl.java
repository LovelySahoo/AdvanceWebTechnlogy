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
 * Servlet implementation class DispatcherCtrl(lovely)
 */
@WebServlet("/DispatcherCtrl")
public class DispatcherCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(lovely)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ConfigCtrl is the url pattern of ConfigCtrl servlet(lovely)
		//getrequestdispatecher provides the facility of dispatching the request to another resource i.e. servlet,jsp or html(lovely)
		request.getRequestDispatcher("/ConfigCtrl").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(lovely)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
