package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet  extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//to maintain data thro
		/*
		 * HttpSession session =req.getSession(); session .setAttribute("k", k);
		 * session.setAttribute("i", i); session.setAttribute("j", j);
		 */
		
		Cookie c=new Cookie("k", k+"");
		
		res.addCookie(c);// this add cookkie to resonse and sends cookie to client
		// client again use this cooki to to another rquest
		

		Cookie c1=new Cookie("i", i+"");
		
		res.addCookie(c1);
		
		

		Cookie c2=new Cookie("j", j+"");
		
		res.addCookie(c2);
		res.sendRedirect("sq");


		
	}

}
