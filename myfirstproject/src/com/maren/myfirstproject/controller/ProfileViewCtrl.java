//java package(lovely)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(lovely)
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.myproject.dao.ProfileDao;
import com.maren.myproject.model.Profile;
/**
 * Servlet implementation class ProfileViewCtrl(lovely)
 */
@WebServlet("/ProfileViewCtrl")
public class ProfileViewCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(lovely)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//reuqest to get a value(lovely)
		int res166 =  (int) request.getAttribute("RES");//added cast to int(lovely)
		PrintWriter out = response.getWriter();// returns a printwriter object that can send character text to the client(lovely)
		if (res166 == 0)//business logic
			//to output text to the console out.println prints the string and moves to next line(lovely)
			out.println("There is some problem ;  Try again .");
		else
			out.println("Data Successfully inserted");
		out.print(" <br/> The Datas are");
		//fetches all remaining row in the result set(lovely)
		List<Profile> list =  new ProfileDao().fetchAll();
		//iterator enables the programmer to traverse a container particularly lists(lovely)
		for (Iterator<Profile> iterator = list.iterator(); iterator.hasNext();) {
			Profile profile166 = (Profile) iterator.next();
			out.println("Name : "+ profile166.getName() +" Userid : "+ profile166.getUserid()+ "mobile "+ profile166.getMobile());
		}
		

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(lovely)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
