package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
		 PrintWriter out = resp.getWriter();
		 	String n = req.getParameter("userName");
	        String p = req.getParameter("userPass");
	        
	        
	    if(p.equals("Ven@123")){
	            RequestDispatcher rd = req.getRequestDispatcher("servlet2");
	            
	            rd.forward(req, resp);
	    } 
	    else {
	            out.print("Password mismatch");
	            RequestDispatcher rd = req.getRequestDispatcher("/login");
	        
	        rd.include(req, resp); 
	                       
	        } 
	}

}
