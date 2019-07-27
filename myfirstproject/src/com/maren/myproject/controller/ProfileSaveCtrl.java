//java package(lovely)
package com.maren.myproject.controller;
//importing all the classes from the packages(lovely)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.myproject.dao.ProfileDao;
import com.maren.myproject.model.Profile;


@WebServlet("/ProfileSaveCtrl")     
public class ProfileSaveCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(lovely)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//creating a new object profile166 of the class(lovely)
		Profile profile166 = new Profile();
		// the set method would set the value and get method will return the variable value(lovely)
		profile166.setUserid(request.getParameter("userid"));
		profile166.setName(request.getParameter("name"));
		profile166.setEmail(request.getParameter("email"));
		//here long class is use parse the charsequence argument as a signed long with specified radix(lovely)
		profile166.setMobile(Long.parseLong(request.getParameter("mobile")));
		// save in database
		int res = new ProfileDao().save(profile166);
		//to set the attribute
		request.setAttribute("RES", res);
		//getrequestdispatecher provides the facility of dispatching the request to another resource i.e. servlet,jsp or html(lovely)
		request.getRequestDispatcher("/ProfileViewCtrl").forward(request, response);
	}

}
