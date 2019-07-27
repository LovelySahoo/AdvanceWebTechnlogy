//java package(lovely)
package com.maren.myproject.dao;
//importing all the classes from the packages(lovely)
import java.sql.Connection;
import java.lang.ClassNotFoundException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maren.myproject.model.Profile;
//class profiledao (lovely)
public class ProfileDao {

	public static Connection getConnection()throws ClassNotFoundException,SQLException {
		//database mysql connection(lovely)
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
	}
	//save is the method for class profile(lovely)
	public int save(Profile profile) {
		//connection and statement has been kept null(lovely)
		Connection con166 = null;
		Statement st166 = null;
		int res166 = 0;
		//exception handling(lovely)
		try {
			//getting connection with datadabse(lovely)
			con166 = getConnection();
			//creating statements(lovely)
			st166 = con166.createStatement();
			//executing queries(lovely)
			res166 = st166.executeUpdate("INSERT INTO test.student (userid, name, email, mobile) VALUES ('"+profile.getUserid()+"', '"+profile.getName()+"', '"+profile.getEmail()+"', "+profile.getMobile()+")"); 
		}catch (ClassNotFoundException | SQLException e) {
			//this method prints a stack trace for this throwable object on the standard error output stream(lovely)
			e.printStackTrace();
		}finally {
			try {
				st166.close();
				con166.close();
			} catch (SQLException e) {
	//this method prints a stack trace for this throwable object on the standard error output stream(lovely)
				e.printStackTrace();
			}
		}
		//terminates the execution of a function and return control to the calling function
		return res166;
	}
	//fetches all remaining row in the result set(lovely)
	public List<Profile> fetchAll() {
		//connection and statement has been kept null(lovely)
		List<Profile> list166=null;
		Connection con166 = null;
		Statement st166 = null;
		//exception handling(lovely)
		try {
			//getting connection with datadabse(lovely)
			con166 = getConnection();
			//creating statements(lovely)
			st166 = con166.createStatement();
			//executing queries(lovely)
			ResultSet rs166 = st166.executeQuery("SELECT * FROM test.profile");
			if(rs166 != null)
				//creating an array for the storage
				list166 = new ArrayList<>();
			while(rs166.next()) {
				////creating a new object profile166 of the class(lovely)
				Profile pr = new Profile();
				// the set method would set the value and get method will return the variable value(lovely)
				pr.setUserid(rs166.getString("userid"));
				pr.setName(rs166.getString("name"));
				pr.setEmail(rs166.getString("email"));
				pr.setMobile(rs166.getLong("mobile"));
				list166.add(pr);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st166.close();
				con166.close();
			} catch (SQLException e) {
//this method prints a stack trace for this throwable object on the standard error output stream(lovely)
				e.printStackTrace();
			}
			
		}
//terminates the execution of a function and return control to the calling function
		return list166;
	}
	//main function(lovely)
	public static void main(String[] args) {
		Connection con166 = null;
		Statement st166 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con166 = DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
			st166 = con166.createStatement();
			ResultSet rs166 = st166.executeQuery("SELECT * FROM test.student");
			while(rs166.next()) {
				String id = rs166.getString("userid");
				String name = rs166.getString("name");
				String email = rs166.getString("email");
				long mobile = rs166.getLong("mobile");
				System.out.println("Id : " +id + "\tName : "+ name+ "\tEmail : " +email + "\tMobile : " +mobile );
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st166.close();
				con166.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
