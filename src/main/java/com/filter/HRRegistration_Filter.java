package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/HRRegistration")
public class HRRegistration_Filter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException 
	{
		System.out.println("HR Registration Filter :: init()");

	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException 
	{
		
		System.out.println("HR Registration Filter :: doFilter()");
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String mobileNo = req.getParameter("mobileNo");
		
		boolean isError = false;
		
		
		if (name == null || name.trim().length() == 0) 
		{
			isError = true;
			req.setAttribute("nameError", "<span class='error'>Please enter name..!</span><br>");
		} 
		else
			if (name.trim().length() <= 2) 
		{
			isError = true;
			req.setAttribute("nameError", "<span class='error'>Please enter atleast 3 character name.!</span><br>");
		} 
		else 
		{
			String alpha = "[a-zA-Z-\s]+";
			if (name.matches(alpha) == false) 
			{
				isError = true;
				req.setAttribute("nameError", "<span class='error'>Please enter valid firstName.!</span><br>");
			}
		}
		
		
		if (password == null || password.trim().length() == 0) {
			isError = true;
			req.setAttribute("passwordError", "<span class='error'>Please enter password.!</span>");
		}
//		else
//		{
//			String alpha ="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
//			if(password.matches(alpha)==false)
//			{
//				isError = true;
//				////					error.append("<span style='color:red'>Please Enter Valid Password..</span><br> ");
//				req.setAttribute("passwordError", "<span class='error'>Please Enter Valid Password</span>");
//			}
//			
//		}
		
	
		if (email == null || email.trim().length() == 0) 
		{
			isError = true;
			req.setAttribute("emailError", "<span class='error'>Please enter email.!</span>");
		} 
		else 
		{
			String alpha = "[a-z.]{2,15}[0-9]{0,4}@[gmail]{5}.[com]{3}";
			if(email.matches(alpha) == false) 
			{
				isError = true;
				req.setAttribute("emailError", "<span class='error'>Please enter valid email.!</span>");
			}
			
		}


//		if (mobile == null || mobile.trim().length() == 0 ) 
//		{
//			isError = true;
//			req.setAttribute("mobileError", "<span class='error'>Please enter mobile number.!!</span>");
//		} 
//		else 
//		{
//			String alpha = "[0-9]{10,10}";
//			if(email.matches(alpha) == false) 
//			{
//				isError = true;
//				req.setAttribute("mobileError", "<span class='error'>Please enter valid mobile number.!</span>");
//			}
			
//		}
		
		
		if(isError==true)
		{
			req.setAttribute("nameValue", name);
			req.setAttribute("emailValue", email);
			req.setAttribute("mobileValue", mobileNo);
					
			req.getRequestDispatcher("HRRegistration.jsp").forward(req, resp);
		}
		else
		{
			chain.doFilter(req, resp);
		}	
		

	}

	@Override
	public void destroy() 
	{
		
	}

}
