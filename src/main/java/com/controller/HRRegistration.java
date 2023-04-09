package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.HrBean;
import com.dao.AdminDAO;
import com.dao.HrDAO;

@WebServlet("/HRRegistration")

public class HRRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String mobileNo = req.getParameter("mobileNo");
		
		HrBean bean = new HrBean();
		
		bean.setName(name);
		bean.setEmail(email);
		bean.setPassword(password);
		bean.setMobileNo(mobileNo);
		
		HrDAO dao = new HrDAO();
		
		dao.addHR(bean);
		
		resp.getWriter().print("HR Record Inserted Successfully...!");
		
		req.getRequestDispatcher("HrLogin.jsp").forward(req, resp);

		
	}

}
