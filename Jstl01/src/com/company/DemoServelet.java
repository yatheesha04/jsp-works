package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@WebServlet("/DemoServlet")
public class DemoServelet  extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
	
	List<Student> s=Arrays.asList(new Student(1,"yatheesha"),new Student(2,"moneesha"));
	
	req.setAttribute("s", s);
	RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
	rd.forward(req, res);
	}
	

}
