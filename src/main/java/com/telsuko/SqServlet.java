package com.telsuko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;


public class SqServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		
		int k = (int)session.getAttribute("k");
		
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("The SqRoot is: "+k);
	
	}

}
