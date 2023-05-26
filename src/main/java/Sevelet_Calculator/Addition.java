package Sevelet_Calculator;


import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")

public class Addition implements Servlet
{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		System.out.println("hello i am here");
//		String num1=req.getParameter("num1");
//		String num2=req.getParameter("num2");
////		System.out.println(num1);
//		System.out.println(num2);//the value will be printed that we have entered
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
//		System.out.println("the sum of "+num1+" and "+num2+" is "+(num1+num2));//this statement is not print in the server it prints in the console
//	res.getWriter().print("the sum of "+num1+" and "+num2+" is "+(num1+num2));	//this statement is used to print the addition of two numbers in the web page.
	

		
		
		res.getWriter().print(" <html><body><h1 style='color:blue'>the sum of "+num1+" and "+num2+" is "+(num1+num2)+"</h1></body></html>");//if we dont take the html and body tag the h1 tag will run but h2 and h3 will not run html and body tag will be inbuilt.
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

}
