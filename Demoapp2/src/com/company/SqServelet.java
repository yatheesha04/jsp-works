package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServelet extends HttpServlet {
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * HttpSession session=request.getSession();
		 * 
		 * 
		 * int k=(int)session.getAttribute("k"); int i=(int)session.getAttribute("i");
		 * int j=(int)session.getAttribute("j");
		 */
		int k=0;
		int i=0;
		int j=0;
		Cookie cookies[]=request.getCookies();
		
		for(Cookie c:cookies )
		{
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
			else if(c.getName().equals("i"))
			{
				i=Integer.parseInt(c.getValue());
			}
			else if(c.getName().equals("j"))
			{
				j=Integer.parseInt(c.getValue());
			}
		}
	
		  k=k*k; 
		  PrintWriter out=response.getWriter(); 
		  out.println("square of two numbers  using coocies "+i +" and "+j+"is"+k);
		 
		
		
	}


}
